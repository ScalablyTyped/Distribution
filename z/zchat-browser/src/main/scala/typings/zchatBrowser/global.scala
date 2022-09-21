package typings.zchatBrowser

import typings.std.File
import typings.zchatBrowser.anon.Cleardeptidonchatended
import typings.zchatBrowser.anon.Comment
import typings.zchatBrowser.anon.Count
import typings.zchatBrowser.anon.PartialVisitorInfo
import typings.zchatBrowser.anon.Title
import typings.zchatBrowser.mod.AccountsStatusEventData
import typings.zchatBrowser.mod.AgentInfo
import typings.zchatBrowser.mod.ChatEventData
import typings.zchatBrowser.mod.ConnectionUpdateEventData
import typings.zchatBrowser.mod.Department
import typings.zchatBrowser.mod.ErrorEventData
import typings.zchatBrowser.mod.HistoryEventData
import typings.zchatBrowser.mod.InitOptions
import typings.zchatBrowser.mod.OperatingHours
import typings.zchatBrowser.mod.SendFileCallbackData
import typings.zchatBrowser.mod.SendFileError
import typings.zchatBrowser.mod.SendOfflineMsgOptions
import typings.zchatBrowser.mod.VisitorInfo
import typings.zchatBrowser.zchatBrowserStrings.account_status
import typings.zchatBrowser.zchatBrowserStrings.agent_update
import typings.zchatBrowser.zchatBrowserStrings.away
import typings.zchatBrowser.zchatBrowserStrings.bad
import typings.zchatBrowser.zchatBrowserStrings.chat
import typings.zchatBrowser.zchatBrowserStrings.closed
import typings.zchatBrowser.zchatBrowserStrings.connected
import typings.zchatBrowser.zchatBrowserStrings.connecting
import typings.zchatBrowser.zchatBrowserStrings.connection_update
import typings.zchatBrowser.zchatBrowserStrings.department_update
import typings.zchatBrowser.zchatBrowserStrings.error
import typings.zchatBrowser.zchatBrowserStrings.good
import typings.zchatBrowser.zchatBrowserStrings.history
import typings.zchatBrowser.zchatBrowserStrings.offline
import typings.zchatBrowser.zchatBrowserStrings.online
import typings.zchatBrowser.zchatBrowserStrings.visitor_update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object zChat {
    
    @JSGlobal("zChat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("zChat.EMAIL_REGEX")
    @js.native
    val EMAIL_REGEX: js.RegExp = js.native
    
    inline def addTags(tags: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addTags(tags: js.Array[String], callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(tags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clearVisitorDefaultDepartment(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearVisitorDefaultDepartment")().asInstanceOf[Unit]
    inline def clearVisitorDefaultDepartment(callback: js.Function1[/* err */ js.Error, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearVisitorDefaultDepartment")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def endChat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endChat")().asInstanceOf[Unit]
    inline def endChat(options: Unit, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("endChat")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def endChat(options: Cleardeptidonchatended): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endChat")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def endChat(options: Cleardeptidonchatended, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("endChat")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fetchChatHistory(callback: js.Function2[/* err */ js.Error, /* data */ Count, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchChatHistory")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getAccountStatus(): online | offline | away = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountStatus")().asInstanceOf[online | offline | away]
    
    inline def getAllDepartments(): js.Array[Department] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllDepartments")().asInstanceOf[js.Array[Department]]
    
    inline def getChatInfo(): Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("getChatInfo")().asInstanceOf[Comment]
    
    inline def getChatLog(): js.Array[ChatEventData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChatLog")().asInstanceOf[js.Array[ChatEventData]]
    
    inline def getConnectionStatus(): connected | connecting | closed = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionStatus")().asInstanceOf[connected | connecting | closed]
    
    inline def getDepartment(id: Double): Department = ^.asInstanceOf[js.Dynamic].applyDynamic("getDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[Department]
    
    inline def getOperatingHours(): js.UndefOr[OperatingHours] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOperatingHours")().asInstanceOf[js.UndefOr[OperatingHours]]
    
    inline def getQueuePosition(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueuePosition")().asInstanceOf[Double]
    
    inline def getServingAgentsInfo(): js.Array[AgentInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServingAgentsInfo")().asInstanceOf[js.Array[AgentInfo]]
    
    inline def getVisitorDefaultDepartment(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorDefaultDepartment")().asInstanceOf[js.UndefOr[Double]]
    
    inline def getVisitorInfo(): VisitorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorInfo")().asInstanceOf[VisitorInfo]
    
    inline def init(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isChatting(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChatting")().asInstanceOf[Boolean]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    
    inline def markAsRead(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markAsRead")().asInstanceOf[Unit]
    
    inline def on_accountstatus(event_name: account_status, handler: js.Function1[/* event_data */ AccountsStatusEventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_agentupdate(event_name: agent_update, handler: js.Function1[/* event_data */ AgentInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_chat(event_name: chat, handler: js.Function1[/* event_data */ ChatEventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_connectionupdate(
      event_name: connection_update,
      handler: js.Function1[/* event_data */ ConnectionUpdateEventData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_departmentupdate(event_name: department_update, handler: js.Function1[/* event_data */ Department, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_error(event_name: error, handler: js.Function1[/* event_data */ ErrorEventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_history(event_name: history, handler: js.Function1[/* event_data */ HistoryEventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_visitorupdate(event_name: visitor_update, handler: js.Function1[/* event_data */ VisitorInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def reconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reconnect")().asInstanceOf[Unit]
    
    inline def removeTags(tags: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeTags(tags: js.Array[String], callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(tags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendChatComment(comment: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendChatComment")(comment.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendChatComment(comment: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendChatComment")(comment.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendChatMsg(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendChatMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendChatMsg(msg: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendChatMsg")(msg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendChatRating(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")().asInstanceOf[Unit]
    inline def sendChatRating(rating: good | bad): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendChatRating(rating: good | bad, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendChatRating(rating: Null, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendEmailTranscript(email: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailTranscript")(email.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendEmailTranscript(email: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailTranscript")(email.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendFile(file: File): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendFile")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendFile(file: File, callback: js.Function2[/* err */ SendFileError, /* data */ SendFileCallbackData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendOfflineMsg(options: SendOfflineMsgOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendOfflineMsg")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendOfflineMsg(options: SendOfflineMsgOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendOfflineMsg")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendTyping(is_typing: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendTyping")(is_typing.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def sendVisitorPath(options: Title): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendVisitorPath")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendVisitorPath(options: Title, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVisitorPath")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setVisitorDefaultDepartment(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorDefaultDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setVisitorDefaultDepartment(id: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorDefaultDepartment")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setVisitorInfo(options: PartialVisitorInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setVisitorInfo(options: PartialVisitorInfo, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorInfo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def un_accountstatus(event_name: account_status, handler: js.Function1[/* event_data */ AccountsStatusEventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def un_agentupdate(event_name: agent_update, handler: js.Function1[/* event_data */ AgentInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def un_chat(event_name: chat, handler: js.Function1[/* event_data */ ChatEventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def un_connectionupdate(
      event_name: connection_update,
      handler: js.Function1[/* event_data */ ConnectionUpdateEventData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def un_departmentupdate(event_name: department_update, handler: js.Function1[/* event_data */ Department, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def un_error(event_name: error, handler: js.Function1[/* event_data */ ErrorEventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def un_history(event_name: history, handler: js.Function1[/* event_data */ HistoryEventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def un_visitorupdate(event_name: visitor_update, handler: js.Function1[/* event_data */ VisitorInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
