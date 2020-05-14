package it.pkg.tests;

import com.jayway.restassured.response.Response;
import it.pkg.common.StatusCodes;
import it.pkg.requests.functions.Project;
import it.pkg.response.model.ProjectModel;
import it.pkg.util.ResponseUtil;
import it.pkg.util.TestBase;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @BeforeClass
    public static void initiate(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @Test(description = "ID-001", alwaysRun = true)
    public static void testGetProject() throws JSONException {

       /*
       Getting the project list as [{},{},]
        */
        Response projectList = Project.getQcenterProjects();

       /*
       Get the value from one object
        */
        String actualDescription = ResponseUtil.getDataValueInDataArray(projectList.asString(), 1, "description");
      /*
      Map the response to object
       */
        ProjectModel projectModel = (ProjectModel) ResponseUtil.getDataObjectValueInDataArray(projectList.asString(), 1, ProjectModel.class);


        Assert.assertEquals(ResponseUtil.getStatus(projectList), StatusCodes.SUCCESS_200_CODE, "Status code should be 200");
        Assert.assertEquals(projectModel.id, 166.0, "Should be equal");
        Assert.assertEquals(actualDescription, "Bahamas Regression", "Description mismatches");

    }

}
