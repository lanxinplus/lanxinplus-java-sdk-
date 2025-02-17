/*
 * LanXin+ OpenAPI
 * LanXin+ OpenAPI Platform
 *
 * 
 *
 * NOTE: This class is auto generated by LanXin+(https://openapi.lanxin.cn).
 * https://openapi.lanxin.cn
 * Do not edit the class manually.
 */


package cn.lanxin.api;

import cn.lanxin.ApiCallback;
import cn.lanxin.ApiClient;
import cn.lanxin.ApiException;
import cn.lanxin.ApiResponse;
import cn.lanxin.Configuration;
import cn.lanxin.Pair;
import cn.lanxin.ProgressRequestBody;
import cn.lanxin.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import cn.lanxin.models.V1OrgFetchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrgApi {
    private ApiClient localVarApiClient;

    public OrgApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrgApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1OrgFetch
     * @param appToken app_token (required)
     * @param orgid orgid (required)
     * @param userToken user_token (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrgFetchCall(String appToken, String orgid, String userToken, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/org/{orgid}/fetch"
            .replaceAll("\\{" + "orgid" + "\\}", localVarApiClient.escapeString(orgid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_token", appToken));
        }

        if (userToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_token", userToken));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1OrgFetchValidateBeforeCall(String appToken, String orgid, String userToken, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'appToken' is set
        if (appToken == null) {
            throw new ApiException("Missing the required parameter 'appToken' when calling v1OrgFetch(Async)");
        }
        
        // verify the required parameter 'orgid' is set
        if (orgid == null) {
            throw new ApiException("Missing the required parameter 'orgid' when calling v1OrgFetch(Async)");
        }
        

        okhttp3.Call localVarCall = v1OrgFetchCall(appToken, orgid, userToken, _callback);
        return localVarCall;

    }

    /**
     * 获取组织详情
     * 获取组织详细信息
     * @param appToken app_token (required)
     * @param orgid orgid (required)
     * @param userToken user_token (optional)
     * @return V1OrgFetchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public V1OrgFetchResponse v1OrgFetch(String appToken, String orgid, String userToken) throws ApiException {
        ApiResponse<V1OrgFetchResponse> localVarResp = v1OrgFetchWithHttpInfo(appToken, orgid, userToken);
        return localVarResp.getData();
    }

    /**
     * 获取组织详情
     * 获取组织详细信息
     * @param appToken app_token (required)
     * @param orgid orgid (required)
     * @param userToken user_token (optional)
     * @return ApiResponse&lt;V1OrgFetchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1OrgFetchResponse> v1OrgFetchWithHttpInfo(String appToken, String orgid, String userToken) throws ApiException {
        okhttp3.Call localVarCall = v1OrgFetchValidateBeforeCall(appToken, orgid, userToken, null);
        Type localVarReturnType = new TypeToken<V1OrgFetchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取组织详情 (asynchronously)
     * 获取组织详细信息
     * @param appToken app_token (required)
     * @param orgid orgid (required)
     * @param userToken user_token (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrgFetchAsync(String appToken, String orgid, String userToken, final ApiCallback<V1OrgFetchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1OrgFetchValidateBeforeCall(appToken, orgid, userToken, _callback);
        Type localVarReturnType = new TypeToken<V1OrgFetchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
