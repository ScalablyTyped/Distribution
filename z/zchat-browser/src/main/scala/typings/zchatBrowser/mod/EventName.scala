package typings.zchatBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.zchatBrowser.zchatBrowserStrings.account_status
  - typings.zchatBrowser.zchatBrowserStrings.connection_update
  - typings.zchatBrowser.zchatBrowserStrings.department_update
  - typings.zchatBrowser.zchatBrowserStrings.visitor_update
  - typings.zchatBrowser.zchatBrowserStrings.agent_update
  - typings.zchatBrowser.zchatBrowserStrings.chat
  - typings.zchatBrowser.zchatBrowserStrings.history
  - typings.zchatBrowser.zchatBrowserStrings.typing
  - typings.zchatBrowser.zchatBrowserStrings.error
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  def account_status: typings.zchatBrowser.zchatBrowserStrings.account_status = this.cast("account_status")
  @scala.inline
  def agent_update: typings.zchatBrowser.zchatBrowserStrings.agent_update = this.cast("agent_update")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typings.zchatBrowser.zchatBrowserStrings.chat = this.cast("chat")
  @scala.inline
  def connection_update: typings.zchatBrowser.zchatBrowserStrings.connection_update = this.cast("connection_update")
  @scala.inline
  def department_update: typings.zchatBrowser.zchatBrowserStrings.department_update = this.cast("department_update")
  @scala.inline
  def error: typings.zchatBrowser.zchatBrowserStrings.error = this.cast("error")
  @scala.inline
  def history: typings.zchatBrowser.zchatBrowserStrings.history = this.cast("history")
  @scala.inline
  def typing: typings.zchatBrowser.zchatBrowserStrings.typing = this.cast("typing")
  @scala.inline
  def visitor_update: typings.zchatBrowser.zchatBrowserStrings.visitor_update = this.cast("visitor_update")
}

