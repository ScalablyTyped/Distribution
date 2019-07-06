package typings
package zchatDashBrowserLib.zchatDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addTags(tags: js.Array[java.lang.String]): scala.Unit = js.native
  def addTags(tags: js.Array[java.lang.String], callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def clearVisitorDefaultDepartment(): scala.Unit = js.native
  def clearVisitorDefaultDepartment(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def getAccountStatus(): zchatDashBrowserLib.zchatDashBrowserLibStrings.online | zchatDashBrowserLib.zchatDashBrowserLibStrings.offline | zchatDashBrowserLib.zchatDashBrowserLibStrings.away = js.native
  def getAllDepartments(): js.Array[Department] = js.native
  def getChatInfo(): zchatDashBrowserLib.Anon_Comment = js.native
  def getChatLog(): js.Array[zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs.ChatEventData] = js.native
  def getConnectionStatus(): zchatDashBrowserLib.zchatDashBrowserLibStrings.connected | zchatDashBrowserLib.zchatDashBrowserLibStrings.connecting | zchatDashBrowserLib.zchatDashBrowserLibStrings.closed = js.native
  def getDepartment(id: scala.Double): Department = js.native
  def getQueuePosition(): scala.Double = js.native
  def getVisitorDefaultDepartment(): Department = js.native
  def getVisitorDefaultDepartment(id: scala.Double): Department = js.native
  def getVisitorInfo(): VisitorInfo = js.native
  def init(initProps: InitProps): scala.Unit = js.native
  def isChatting(): scala.Boolean = js.native
  def on(event_name: EventName, handler: js.Function1[/* event_data */ js.UndefOr[EventData], scala.Unit]): scala.Unit = js.native
  def removeTags(tags: js.Array[java.lang.String]): scala.Unit = js.native
  def removeTags(tags: js.Array[java.lang.String], callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def sendChatComment(comment: java.lang.String): scala.Unit = js.native
  def sendChatComment(comment: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def sendChatMsg(msg: java.lang.String): scala.Unit = js.native
  def sendChatMsg(msg: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def sendChatRating(): scala.Unit = js.native
  def sendChatRating(rating: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  @JSName("sendChatRating")
  def sendChatRating_bad(rating: zchatDashBrowserLib.zchatDashBrowserLibStrings.bad): scala.Unit = js.native
  @JSName("sendChatRating")
  def sendChatRating_bad(
    rating: zchatDashBrowserLib.zchatDashBrowserLibStrings.bad,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  @JSName("sendChatRating")
  def sendChatRating_good(rating: zchatDashBrowserLib.zchatDashBrowserLibStrings.good): scala.Unit = js.native
  @JSName("sendChatRating")
  def sendChatRating_good(
    rating: zchatDashBrowserLib.zchatDashBrowserLibStrings.good,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def sendFile(file: stdLib.File): scala.Unit = js.native
  def sendFile(
    file: stdLib.File,
    callback: js.Function2[
      /* err */ SendFileErrorMessage, 
      /* data */ zchatDashBrowserLib.Anon_Mimetype, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sendOfflineMsg(
    options: zchatDashBrowserLib.Anon_Department,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def sendTyping(is_typing: scala.Boolean): scala.Unit = js.native
  def sendVisitorPath(options: zchatDashBrowserLib.Anon_Title): scala.Unit = js.native
  def sendVisitorPath(
    options: zchatDashBrowserLib.Anon_Title,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def setVisitorDefaultDepartment(id: scala.Double): scala.Unit = js.native
  def setVisitorDefaultDepartment(id: scala.Double, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def setVisitorInfo(options: stdLib.Partial[VisitorInfo]): scala.Unit = js.native
  def setVisitorInfo(options: stdLib.Partial[VisitorInfo], callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def un(event_name: EventName, handler: js.Function1[/* event_data */ js.UndefOr[EventData], scala.Unit]): scala.Unit = js.native
}

