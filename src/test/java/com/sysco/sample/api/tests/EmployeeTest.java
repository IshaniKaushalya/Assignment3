package com.sysco.sample.api.tests;

import com.jayway.restassured.response.Response;
import com.sysco.sample.api.common.StatusCodes;
import com.sysco.sample.api.requests.functions.Project;
import com.sysco.sample.api.response.model.EmployeeModel;
import com.sysco.sample.api.util.ResponseUtil;
import com.sysco.sample.api.util.TestBase;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest extends TestBase {


    @BeforeClass
    public static void initiate(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @Test(description = "ID-001", alwaysRun = true)
    public static void testGetProject() throws JSONException {


        Response projectList = Project.getEmployees();

        String employeeStatus =ResponseUtil.getDataFromObject(projectList.asString(), "status", EmployeeModel.class);

        Assert.assertEquals(ResponseUtil.getStatus(projectList), StatusCodes.SUCCESS_200_CODE, "Status code should be 200");
        Assert.assertEquals(employeeStatus, "success", "Should be equal");

    }

}
