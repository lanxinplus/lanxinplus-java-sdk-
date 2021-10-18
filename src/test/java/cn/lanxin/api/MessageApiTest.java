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

import cn.lanxin.ApiException;
import cn.lanxin.models.V1ChatNotificationFetchResponse;
import cn.lanxin.models.V1MessagesCreateRequestBody;
import cn.lanxin.models.V1MessagesCreateResponse;
import cn.lanxin.models.V1MessagesNotificationCreateRequestBody;
import cn.lanxin.models.V1MessagesNotificationCreateResponse;
import cn.lanxin.models.V1MessagesRevokeRequestBody;
import cn.lanxin.models.V1MessagesRevokeResponse;
import cn.lanxin.models.V2ChatNotificationUpdateRequestBody;
import cn.lanxin.models.V2ChatNotificationUpdateResponse;
import cn.lanxin.models.V2EventNotificationCreateRequestBody;
import cn.lanxin.models.V2EventNotificationCreateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessageApi
 */
@Ignore
public class MessageApiTest {

    private final MessageApi api = new MessageApi();

    
    /**
     * 获取通知消息会话状态
     *
     * 获取通知消息会话状态
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1ChatNotificationFetchTest() throws ApiException {
        String appToken = null;
        String userid = null;
        String userToken = null;
        V1ChatNotificationFetchResponse response = api.v1ChatNotificationFetch(appToken, userid, userToken);

        // TODO: test validations
    }
    
    /**
     * 发送应用消息应用号通道
     *
     * 通过该接口，应用可以给指定的人和分支发送系统定义的几种消息。适用于绝大多数应用消息通知场景，消息卡片中可携带链接，支持点击跳转应用详情页
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessagesCreateTest() throws ApiException {
        String appToken = null;
        V1MessagesCreateRequestBody v1MessagesCreateRequestBody = null;
        String userToken = null;
        V1MessagesCreateResponse response = api.v1MessagesCreate(appToken, v1MessagesCreateRequestBody, userToken);

        // TODO: test validations
    }
    
    /**
     * 发送通知消息
     *
     * 通过该接口，应用可以给指定人发送通知消息。 特别说明：该消息类型仅展示会话列表摘要，不展示会话消息详情，点击会话摘要直接跳转应用首页入口。仅适用于通知，邮件等特定代办数量&amp;摘要类型的消息场景。普通办公类卡片消息不建议使用该接口
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessagesNotificationCreateTest() throws ApiException {
        String appToken = null;
        V1MessagesNotificationCreateRequestBody v1MessagesNotificationCreateRequestBody = null;
        String userToken = null;
        V1MessagesNotificationCreateResponse response = api.v1MessagesNotificationCreate(appToken, v1MessagesNotificationCreateRequestBody, userToken);

        // TODO: test validations
    }
    
    /**
     * 撤回消息
     *
     * 通过该接口，应用可以撤回已发送消息，消息撤回有时效性，并非所有消息都可以撤回。目前私聊和群聊只能撤回5分钟内发送的消息，应用消息（公号通道）可以撤回24小时内的消息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessagesRevokeTest() throws ApiException {
        String appToken = null;
        V1MessagesRevokeRequestBody v1MessagesRevokeRequestBody = null;
        String userToken = null;
        V1MessagesRevokeResponse response = api.v1MessagesRevoke(appToken, v1MessagesRevokeRequestBody, userToken);

        // TODO: test validations
    }
    
    /**
     * 更新通知消息会话状态（批量）
     *
     * 更新通知消息会话状态（批量）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ChatNotificationUpdateTest() throws ApiException {
        String appToken = null;
        V2ChatNotificationUpdateRequestBody v2ChatNotificationUpdateRequestBody = null;
        String userToken = null;
        V2ChatNotificationUpdateResponse response = api.v2ChatNotificationUpdate(appToken, v2ChatNotificationUpdateRequestBody, userToken);

        // TODO: test validations
    }
    
    /**
     * 发送应用消息应用号通道
     *
     * 通过该接口，应用可以给指定的人和分支发送系统定义的几种消息。适用于绝大多数应用消息通知场景，消息卡片中可携带链接，支持点击跳转应用详情页
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2EventNotificationCreateTest() throws ApiException {
        String appToken = null;
        V2EventNotificationCreateRequestBody v2EventNotificationCreateRequestBody = null;
        String userToken = null;
        V2EventNotificationCreateResponse response = api.v2EventNotificationCreate(appToken, v2EventNotificationCreateRequestBody, userToken);

        // TODO: test validations
    }
    
}
