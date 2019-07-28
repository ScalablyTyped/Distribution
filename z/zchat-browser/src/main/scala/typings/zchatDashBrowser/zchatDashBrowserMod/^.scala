package typings.zchatDashBrowser.zchatDashBrowserMod

import typings.std.Error
import typings.std.File
import typings.std.Partial
import typings.zchatDashBrowser.Anon_Comment
import typings.zchatDashBrowser.Anon_Department
import typings.zchatDashBrowser.Anon_Mimetype
import typings.zchatDashBrowser.Anon_Title
import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEventNs.ChatEventData
import typings.zchatDashBrowser.zchatDashBrowserStrings.away
import typings.zchatDashBrowser.zchatDashBrowserStrings.bad
import typings.zchatDashBrowser.zchatDashBrowserStrings.closed
import typings.zchatDashBrowser.zchatDashBrowserStrings.connected
import typings.zchatDashBrowser.zchatDashBrowserStrings.connecting
import typings.zchatDashBrowser.zchatDashBrowserStrings.good
import typings.zchatDashBrowser.zchatDashBrowserStrings.offline
import typings.zchatDashBrowser.zchatDashBrowserStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addTags(tags: js.Array[String]): Unit = js.native
  def addTags(tags: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def clearVisitorDefaultDepartment(): Unit = js.native
  def clearVisitorDefaultDepartment(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def getAccountStatus(): online | offline | away = js.native
  def getAllDepartments(): js.Array[Department] = js.native
  def getChatInfo(): Anon_Comment = js.native
  def getChatLog(): js.Array[ChatEventData] = js.native
  def getConnectionStatus(): connected | connecting | closed = js.native
  def getDepartment(id: Double): Department = js.native
  def getQueuePosition(): Double = js.native
  def getVisitorDefaultDepartment(): Department = js.native
  def getVisitorDefaultDepartment(id: Double): Department = js.native
  def getVisitorInfo(): VisitorInfo = js.native
  def init(initProps: InitProps): Unit = js.native
  def isChatting(): Boolean = js.native
  def on(event_name: EventName, handler: js.Function1[/* event_data */ js.UndefOr[EventData], Unit]): Unit = js.native
  def removeTags(tags: js.Array[String]): Unit = js.native
  def removeTags(tags: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendChatComment(comment: String): Unit = js.native
  def sendChatComment(comment: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendChatMsg(msg: String): Unit = js.native
  def sendChatMsg(msg: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendChatRating(): Unit = js.native
  def sendChatRating(rating: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSName("sendChatRating")
  def sendChatRating_bad(rating: bad): Unit = js.native
  @JSName("sendChatRating")
  def sendChatRating_bad(rating: bad, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSName("sendChatRating")
  def sendChatRating_good(rating: good): Unit = js.native
  @JSName("sendChatRating")
  def sendChatRating_good(rating: good, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendFile(file: File): Unit = js.native
  def sendFile(file: File, callback: js.Function2[/* err */ SendFileErrorMessage, /* data */ Anon_Mimetype, Unit]): Unit = js.native
  def sendOfflineMsg(options: Anon_Department, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendTyping(is_typing: Boolean): Unit = js.native
  def sendVisitorPath(options: Anon_Title): Unit = js.native
  def sendVisitorPath(options: Anon_Title, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setVisitorDefaultDepartment(id: Double): Unit = js.native
  def setVisitorDefaultDepartment(id: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setVisitorInfo(options: Partial[VisitorInfo]): Unit = js.native
  def setVisitorInfo(options: Partial[VisitorInfo], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def un(event_name: EventName, handler: js.Function1[/* event_data */ js.UndefOr[EventData], Unit]): Unit = js.native
}

