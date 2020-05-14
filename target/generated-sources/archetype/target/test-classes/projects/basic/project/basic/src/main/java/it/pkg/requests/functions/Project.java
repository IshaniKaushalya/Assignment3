package it.pkg.requests.functions;

import com.jayway.restassured.response.Response;
import it.pkg.common.URIs;
import it.pkg.util.HeadersUtil;
import it.pkg.util.RequestUtil;
import com.syscolab.qe.core.api.util.RequestMethods;

public class Project {


    public static Response getQcenterProjects() {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), "", URIs.retrieveProjectsURI(), RequestMethods.GET.toString(), null);

    }

    public static Response getQcenterProjects(String uri) {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), null, uri, RequestMethods.GET.toString(), null);

    }
}
