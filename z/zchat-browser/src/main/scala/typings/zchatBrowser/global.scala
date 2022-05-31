package typings.zchatBrowser

import typings.std.Error
import typings.std.File
import typings.zchatBrowser.anon.Comment
import typings.zchatBrowser.anon.Mimetype
import typings.zchatBrowser.anon.PartialVisitorInfo
import typings.zchatBrowser.anon.Title
import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.mod.Department
import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.mod.EventName
import typings.zchatBrowser.mod.InitProps
import typings.zchatBrowser.mod.SendFileErrorMessage
import typings.zchatBrowser.mod.VisitorInfo
import typings.zchatBrowser.zchatBrowserStrings.away
import typings.zchatBrowser.zchatBrowserStrings.bad
import typings.zchatBrowser.zchatBrowserStrings.closed
import typings.zchatBrowser.zchatBrowserStrings.connected
import typings.zchatBrowser.zchatBrowserStrings.connecting
import typings.zchatBrowser.zchatBrowserStrings.good
import typings.zchatBrowser.zchatBrowserStrings.offline
import typings.zchatBrowser.zchatBrowserStrings.online
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object zChat {
    
    @JSGlobal("zChat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addTags(tags: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addTags(tags: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(tags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clearVisitorDefaultDepartment(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearVisitorDefaultDepartment")().asInstanceOf[Unit]
    inline def clearVisitorDefaultDepartment(callback: js.Function1[/* err */ Error, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearVisitorDefaultDepartment")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getAccountStatus(): online | offline | away = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountStatus")().asInstanceOf[online | offline | away]
    
    inline def getAllDepartments(): js.Array[Department] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllDepartments")().asInstanceOf[js.Array[Department]]
    
    inline def getChatInfo(): Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("getChatInfo")().asInstanceOf[Comment]
    
    inline def getChatLog(): js.Array[ChatEventData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChatLog")().asInstanceOf[js.Array[ChatEventData]]
    
    inline def getConnectionStatus(): connected | connecting | closed = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionStatus")().asInstanceOf[connected | connecting | closed]
    
    inline def getDepartment(id: Double): Department = ^.asInstanceOf[js.Dynamic].applyDynamic("getDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[Department]
    
    inline def getQueuePosition(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueuePosition")().asInstanceOf[Double]
    
    inline def getVisitorDefaultDepartment(): Department = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorDefaultDepartment")().asInstanceOf[Department]
    inline def getVisitorDefaultDepartment(id: Double): Department = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorDefaultDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[Department]
    
    inline def getVisitorInfo(): VisitorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorInfo")().asInstanceOf[VisitorInfo]
    
    inline def init(initProps: InitProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(initProps.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isChatting(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChatting")().asInstanceOf[Boolean]
    
    inline def on(event_name: EventName, handler: js.Function1[/* event_data */ js.UndefOr[EventData], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeTags(tags: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeTags(tags: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(tags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendChatComment(comment: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendChatComment")(comment.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendChatComment(comment: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendChatComment")(comment.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendChatMsg(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendChatMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendChatMsg(msg: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendChatMsg")(msg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendChatRating(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")().asInstanceOf[Unit]
    inline def sendChatRating(rating: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendChatRating_bad(rating: bad): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendChatRating_bad(rating: bad, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendChatRating_good(rating: good): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendChatRating_good(rating: good, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendFile(file: File): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendFile")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendFile(file: File, callback: js.Function2[/* err */ SendFileErrorMessage, /* data */ Mimetype, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendOfflineMsg(options: typings.zchatBrowser.anon.Department, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendOfflineMsg")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendTyping(is_typing: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendTyping")(is_typing.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def sendVisitorPath(options: Title): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendVisitorPath")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendVisitorPath(options: Title, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVisitorPath")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setVisitorDefaultDepartment(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorDefaultDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setVisitorDefaultDepartment(id: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorDefaultDepartment")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setVisitorInfo(options: PartialVisitorInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setVisitorInfo(options: PartialVisitorInfo, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorInfo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def un(event_name: EventName, handler: js.Function1[/* event_data */ js.UndefOr[EventData], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
