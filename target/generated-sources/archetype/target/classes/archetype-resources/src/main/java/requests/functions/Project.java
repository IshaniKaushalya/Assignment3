#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.requests.functions;

import com.jayway.restassured.response.Response;
import ${package}.common.URIs;
import ${package}.util.HeadersUtil;
import ${package}.util.RequestUtil;
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
