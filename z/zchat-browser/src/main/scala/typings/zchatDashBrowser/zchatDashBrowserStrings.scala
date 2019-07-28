package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod.EventName
import typings.zchatDashBrowser.zchatDashBrowserMod.SendFileErrorMessage
import typings.zchatDashBrowser.zchatDashBrowserMod._EventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object zchatDashBrowserStrings {
  @js.native
  sealed trait CONN_ERROR extends SendFileErrorMessage
  
  @js.native
  sealed trait EXCEED_SIZE_LIMIT extends SendFileErrorMessage
  
  @js.native
  sealed trait INTERNAL_ERROR extends SendFileErrorMessage
  
  @js.native
  sealed trait INVALID_EXTENSION extends SendFileErrorMessage
  
  @js.native
  sealed trait LINK_ACTION extends js.Object
  
  @js.native
  sealed trait LIST_TEMPLATE extends js.Object
  
  @js.native
  sealed trait NOT_ALLOWED extends SendFileErrorMessage
  
  @js.native
  sealed trait NOT_SUPPORTED extends SendFileErrorMessage
  
  @js.native
  sealed trait PANEL_TEMPLATE extends js.Object
  
  @js.native
  sealed trait PANEL_TEMPLATE_CAROUSEL extends js.Object
  
  @js.native
  sealed trait QUICK_REPLIES extends js.Object
  
  @js.native
  sealed trait QUICK_REPLY_ACTION extends js.Object
  
  @js.native
  sealed trait UNKNOWN_ERROR extends SendFileErrorMessage
  
  @js.native
  sealed trait account_status extends EventName
  
  @js.native
  sealed trait agent_update extends EventName
  
  @js.native
  sealed trait away extends _EventData
  
  @js.native
  sealed trait bad extends js.Object
  
  @js.native
  sealed trait chat extends EventName
  
  @js.native
  sealed trait chatDOTcomment extends js.Object
  
  @js.native
  sealed trait chatDOTfile extends js.Object
  
  @js.native
  sealed trait chatDOTmemberjoin extends js.Object
  
  @js.native
  sealed trait chatDOTmemberleave extends js.Object
  
  @js.native
  sealed trait chatDOTmsg extends js.Object
  
  @js.native
  sealed trait chatDOTqueue_position extends js.Object
  
  @js.native
  sealed trait chatDOTrating extends js.Object
  
  @js.native
  sealed trait chatDOTrequestDOTrating extends js.Object
  
  @js.native
  sealed trait closed extends _EventData
  
  @js.native
  sealed trait connected extends _EventData
  
  @js.native
  sealed trait connecting extends _EventData
  
  @js.native
  sealed trait connection_update extends EventName
  
  @js.native
  sealed trait department_update extends EventName
  
  @js.native
  sealed trait error extends EventName
  
  @js.native
  sealed trait good extends js.Object
  
  @js.native
  sealed trait history extends EventName
  
  @js.native
  sealed trait last_read extends js.Object
  
  @js.native
  sealed trait offline extends _EventData
  
  @js.native
  sealed trait online extends _EventData
  
  @js.native
  sealed trait typing extends EventName
  
  @js.native
  sealed trait visitor_update extends EventName
  
  @scala.inline
  def CONN_ERROR: CONN_ERROR = "CONN_ERROR".asInstanceOf[CONN_ERROR]
  @scala.inline
  def EXCEED_SIZE_LIMIT: EXCEED_SIZE_LIMIT = "EXCEED_SIZE_LIMIT".asInstanceOf[EXCEED_SIZE_LIMIT]
  @scala.inline
  def INTERNAL_ERROR: INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[INTERNAL_ERROR]
  @scala.inline
  def INVALID_EXTENSION: INVALID_EXTENSION = "INVALID_EXTENSION".asInstanceOf[INVALID_EXTENSION]
  @scala.inline
  def LINK_ACTION: LINK_ACTION = "LINK_ACTION".asInstanceOf[LINK_ACTION]
  @scala.inline
  def LIST_TEMPLATE: LIST_TEMPLATE = "LIST_TEMPLATE".asInstanceOf[LIST_TEMPLATE]
  @scala.inline
  def NOT_ALLOWED: NOT_ALLOWED = "NOT_ALLOWED".asInstanceOf[NOT_ALLOWED]
  @scala.inline
  def NOT_SUPPORTED: NOT_SUPPORTED = "NOT_SUPPORTED".asInstanceOf[NOT_SUPPORTED]
  @scala.inline
  def PANEL_TEMPLATE: PANEL_TEMPLATE = "PANEL_TEMPLATE".asInstanceOf[PANEL_TEMPLATE]
  @scala.inline
  def PANEL_TEMPLATE_CAROUSEL: PANEL_TEMPLATE_CAROUSEL = "PANEL_TEMPLATE_CAROUSEL".asInstanceOf[PANEL_TEMPLATE_CAROUSEL]
  @scala.inline
  def QUICK_REPLIES: QUICK_REPLIES = "QUICK_REPLIES".asInstanceOf[QUICK_REPLIES]
  @scala.inline
  def QUICK_REPLY_ACTION: QUICK_REPLY_ACTION = "QUICK_REPLY_ACTION".asInstanceOf[QUICK_REPLY_ACTION]
  @scala.inline
  def UNKNOWN_ERROR: UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[UNKNOWN_ERROR]
  @scala.inline
  def account_status: account_status = "account_status".asInstanceOf[account_status]
  @scala.inline
  def agent_update: agent_update = "agent_update".asInstanceOf[agent_update]
  @scala.inline
  def away: away = "away".asInstanceOf[away]
  @scala.inline
  def bad: bad = "bad".asInstanceOf[bad]
  @scala.inline
  def chat: chat = "chat".asInstanceOf[chat]
  @scala.inline
  def chatDOTcomment: chatDOTcomment = "chat.comment".asInstanceOf[chatDOTcomment]
  @scala.inline
  def chatDOTfile: chatDOTfile = "chat.file".asInstanceOf[chatDOTfile]
  @scala.inline
  def chatDOTmemberjoin: chatDOTmemberjoin = "chat.memberjoin".asInstanceOf[chatDOTmemberjoin]
  @scala.inline
  def chatDOTmemberleave: chatDOTmemberleave = "chat.memberleave".asInstanceOf[chatDOTmemberleave]
  @scala.inline
  def chatDOTmsg: chatDOTmsg = "chat.msg".asInstanceOf[chatDOTmsg]
  @scala.inline
  def chatDOTqueue_position: chatDOTqueue_position = "chat.queue_position".asInstanceOf[chatDOTqueue_position]
  @scala.inline
  def chatDOTrating: chatDOTrating = "chat.rating".asInstanceOf[chatDOTrating]
  @scala.inline
  def chatDOTrequestDOTrating: chatDOTrequestDOTrating = "chat.request.rating".asInstanceOf[chatDOTrequestDOTrating]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def connection_update: connection_update = "connection_update".asInstanceOf[connection_update]
  @scala.inline
  def department_update: department_update = "department_update".asInstanceOf[department_update]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def good: good = "good".asInstanceOf[good]
  @scala.inline
  def history: history = "history".asInstanceOf[history]
  @scala.inline
  def last_read: last_read = "last_read".asInstanceOf[last_read]
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  @scala.inline
  def typing: typing = "typing".asInstanceOf[typing]
  @scala.inline
  def visitor_update: visitor_update = "visitor_update".asInstanceOf[visitor_update]
}

