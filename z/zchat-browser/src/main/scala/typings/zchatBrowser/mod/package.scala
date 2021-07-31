package typings.zchatBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def addTags(tags: js.Array[java.lang.String]): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(tags.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def addTags(tags: js.Array[java.lang.String], callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(tags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def clearVisitorDefaultDepartment(): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearVisitorDefaultDepartment")().asInstanceOf[scala.Unit]
@scala.inline
def clearVisitorDefaultDepartment(callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearVisitorDefaultDepartment")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def getAccountStatus(): typings.zchatBrowser.zchatBrowserStrings.online | typings.zchatBrowser.zchatBrowserStrings.offline | typings.zchatBrowser.zchatBrowserStrings.away = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getAccountStatus")().asInstanceOf[typings.zchatBrowser.zchatBrowserStrings.online | typings.zchatBrowser.zchatBrowserStrings.offline | typings.zchatBrowser.zchatBrowserStrings.away]

@scala.inline
def getAllDepartments(): js.Array[typings.zchatBrowser.mod.Department] = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getAllDepartments")().asInstanceOf[js.Array[typings.zchatBrowser.mod.Department]]

@scala.inline
def getChatInfo(): typings.zchatBrowser.anon.Comment = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChatInfo")().asInstanceOf[typings.zchatBrowser.anon.Comment]

@scala.inline
def getChatLog(): js.Array[typings.zchatBrowser.mod.ChatEvent.ChatEventData] = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChatLog")().asInstanceOf[js.Array[typings.zchatBrowser.mod.ChatEvent.ChatEventData]]

@scala.inline
def getConnectionStatus(): typings.zchatBrowser.zchatBrowserStrings.connected | typings.zchatBrowser.zchatBrowserStrings.connecting | typings.zchatBrowser.zchatBrowserStrings.closed = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionStatus")().asInstanceOf[typings.zchatBrowser.zchatBrowserStrings.connected | typings.zchatBrowser.zchatBrowserStrings.connecting | typings.zchatBrowser.zchatBrowserStrings.closed]

@scala.inline
def getDepartment(id: scala.Double): typings.zchatBrowser.mod.Department = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[typings.zchatBrowser.mod.Department]

@scala.inline
def getQueuePosition(): scala.Double = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getQueuePosition")().asInstanceOf[scala.Double]

@scala.inline
def getVisitorDefaultDepartment(): typings.zchatBrowser.mod.Department = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorDefaultDepartment")().asInstanceOf[typings.zchatBrowser.mod.Department]
@scala.inline
def getVisitorDefaultDepartment(id: scala.Double): typings.zchatBrowser.mod.Department = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorDefaultDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[typings.zchatBrowser.mod.Department]

@scala.inline
def getVisitorInfo(): typings.zchatBrowser.mod.VisitorInfo = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorInfo")().asInstanceOf[typings.zchatBrowser.mod.VisitorInfo]

@scala.inline
def init(initProps: typings.zchatBrowser.mod.InitProps): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("init")(initProps.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def isChatting(): scala.Boolean = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isChatting")().asInstanceOf[scala.Boolean]

@scala.inline
def on(
  event_name: typings.zchatBrowser.mod.EventName,
  handler: js.Function1[/* event_data */ js.UndefOr[typings.zchatBrowser.mod.EventData], scala.Unit]
): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def removeTags(tags: js.Array[java.lang.String]): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(tags.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def removeTags(tags: js.Array[java.lang.String], callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(tags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def sendChatComment(comment: java.lang.String): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatComment")(comment.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def sendChatComment(comment: java.lang.String, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatComment")(comment.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def sendChatMsg(msg: java.lang.String): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def sendChatMsg(msg: java.lang.String, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatMsg")(msg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def sendChatRating(): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")().asInstanceOf[scala.Unit]
@scala.inline
def sendChatRating(rating: scala.Unit, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def sendChatRating_bad(rating: typings.zchatBrowser.zchatBrowserStrings.bad): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def sendChatRating_bad(
  rating: typings.zchatBrowser.zchatBrowserStrings.bad,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def sendChatRating_good(rating: typings.zchatBrowser.zchatBrowserStrings.good): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def sendChatRating_good(
  rating: typings.zchatBrowser.zchatBrowserStrings.good,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def sendFile(file: typings.std.File): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendFile")(file.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def sendFile(
  file: typings.std.File,
  callback: js.Function2[
  /* err */ typings.zchatBrowser.mod.SendFileErrorMessage, 
  /* data */ typings.zchatBrowser.anon.Mimetype, 
  scala.Unit
]
): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def sendOfflineMsg(
  options: typings.zchatBrowser.anon.Department,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendOfflineMsg")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def sendTyping(is_typing: scala.Boolean): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendTyping")(is_typing.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def sendVisitorPath(options: typings.zchatBrowser.anon.Title): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendVisitorPath")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def sendVisitorPath(
  options: typings.zchatBrowser.anon.Title,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendVisitorPath")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def setVisitorDefaultDepartment(id: scala.Double): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorDefaultDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def setVisitorDefaultDepartment(id: scala.Double, callback: js.Function1[/* err */ typings.std.Error, scala.Unit]): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorDefaultDepartment")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def setVisitorInfo(options: typings.zchatBrowser.anon.PartialVisitorInfo): scala.Unit = typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorInfo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def setVisitorInfo(
  options: typings.zchatBrowser.anon.PartialVisitorInfo,
  callback: js.Function1[/* err */ typings.std.Error, scala.Unit]
): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorInfo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def un(
  event_name: typings.zchatBrowser.mod.EventName,
  handler: js.Function1[/* event_data */ js.UndefOr[typings.zchatBrowser.mod.EventData], scala.Unit]
): scala.Unit = (typings.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
