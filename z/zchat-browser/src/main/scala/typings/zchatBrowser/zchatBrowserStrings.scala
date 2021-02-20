package typings.zchatBrowser

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.mod.EventName
import typings.zchatBrowser.mod.SendFileErrorMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zchatBrowserStrings {
  
  @js.native
  sealed trait CONN_ERROR extends SendFileErrorMessage
  @scala.inline
  def CONN_ERROR: CONN_ERROR = "CONN_ERROR".asInstanceOf[CONN_ERROR]
  
  @js.native
  sealed trait EXCEED_SIZE_LIMIT extends SendFileErrorMessage
  @scala.inline
  def EXCEED_SIZE_LIMIT: EXCEED_SIZE_LIMIT = "EXCEED_SIZE_LIMIT".asInstanceOf[EXCEED_SIZE_LIMIT]
  
  @js.native
  sealed trait INTERNAL_ERROR extends SendFileErrorMessage
  @scala.inline
  def INTERNAL_ERROR: INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[INTERNAL_ERROR]
  
  @js.native
  sealed trait INVALID_EXTENSION extends SendFileErrorMessage
  @scala.inline
  def INVALID_EXTENSION: INVALID_EXTENSION = "INVALID_EXTENSION".asInstanceOf[INVALID_EXTENSION]
  
  @js.native
  sealed trait LINK_ACTION extends StObject
  @scala.inline
  def LINK_ACTION: LINK_ACTION = "LINK_ACTION".asInstanceOf[LINK_ACTION]
  
  @js.native
  sealed trait LIST_TEMPLATE extends StObject
  @scala.inline
  def LIST_TEMPLATE: LIST_TEMPLATE = "LIST_TEMPLATE".asInstanceOf[LIST_TEMPLATE]
  
  @js.native
  sealed trait NOT_ALLOWED extends SendFileErrorMessage
  @scala.inline
  def NOT_ALLOWED: NOT_ALLOWED = "NOT_ALLOWED".asInstanceOf[NOT_ALLOWED]
  
  @js.native
  sealed trait NOT_SUPPORTED extends SendFileErrorMessage
  @scala.inline
  def NOT_SUPPORTED: NOT_SUPPORTED = "NOT_SUPPORTED".asInstanceOf[NOT_SUPPORTED]
  
  @js.native
  sealed trait PANEL_TEMPLATE extends StObject
  @scala.inline
  def PANEL_TEMPLATE: PANEL_TEMPLATE = "PANEL_TEMPLATE".asInstanceOf[PANEL_TEMPLATE]
  
  @js.native
  sealed trait PANEL_TEMPLATE_CAROUSEL extends StObject
  @scala.inline
  def PANEL_TEMPLATE_CAROUSEL: PANEL_TEMPLATE_CAROUSEL = "PANEL_TEMPLATE_CAROUSEL".asInstanceOf[PANEL_TEMPLATE_CAROUSEL]
  
  @js.native
  sealed trait QUICK_REPLIES extends StObject
  @scala.inline
  def QUICK_REPLIES: QUICK_REPLIES = "QUICK_REPLIES".asInstanceOf[QUICK_REPLIES]
  
  @js.native
  sealed trait QUICK_REPLY_ACTION extends StObject
  @scala.inline
  def QUICK_REPLY_ACTION: QUICK_REPLY_ACTION = "QUICK_REPLY_ACTION".asInstanceOf[QUICK_REPLY_ACTION]
  
  @js.native
  sealed trait UNKNOWN_ERROR extends SendFileErrorMessage
  @scala.inline
  def UNKNOWN_ERROR: UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[UNKNOWN_ERROR]
  
  @js.native
  sealed trait account_status extends EventName
  @scala.inline
  def account_status: account_status = "account_status".asInstanceOf[account_status]
  
  @js.native
  sealed trait agent_update extends EventName
  @scala.inline
  def agent_update: agent_update = "agent_update".asInstanceOf[agent_update]
  
  @js.native
  sealed trait away extends EventData
  @scala.inline
  def away: away = "away".asInstanceOf[away]
  
  @js.native
  sealed trait bad extends StObject
  @scala.inline
  def bad: bad = "bad".asInstanceOf[bad]
  
  @js.native
  sealed trait chat extends EventName
  @scala.inline
  def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait chatDotcomment extends StObject
  @scala.inline
  def chatDotcomment: chatDotcomment = "chat.comment".asInstanceOf[chatDotcomment]
  
  @js.native
  sealed trait chatDotfile extends StObject
  @scala.inline
  def chatDotfile: chatDotfile = "chat.file".asInstanceOf[chatDotfile]
  
  @js.native
  sealed trait chatDotmemberjoin extends StObject
  @scala.inline
  def chatDotmemberjoin: chatDotmemberjoin = "chat.memberjoin".asInstanceOf[chatDotmemberjoin]
  
  @js.native
  sealed trait chatDotmemberleave extends StObject
  @scala.inline
  def chatDotmemberleave: chatDotmemberleave = "chat.memberleave".asInstanceOf[chatDotmemberleave]
  
  @js.native
  sealed trait chatDotmsg extends StObject
  @scala.inline
  def chatDotmsg: chatDotmsg = "chat.msg".asInstanceOf[chatDotmsg]
  
  @js.native
  sealed trait chatDotqueue_position extends StObject
  @scala.inline
  def chatDotqueue_position: chatDotqueue_position = "chat.queue_position".asInstanceOf[chatDotqueue_position]
  
  @js.native
  sealed trait chatDotrating extends StObject
  @scala.inline
  def chatDotrating: chatDotrating = "chat.rating".asInstanceOf[chatDotrating]
  
  @js.native
  sealed trait chatDotrequestDotrating extends StObject
  @scala.inline
  def chatDotrequestDotrating: chatDotrequestDotrating = "chat.request.rating".asInstanceOf[chatDotrequestDotrating]
  
  @js.native
  sealed trait closed extends EventData
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait connected extends EventData
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting extends EventData
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait connection_update extends EventName
  @scala.inline
  def connection_update: connection_update = "connection_update".asInstanceOf[connection_update]
  
  @js.native
  sealed trait department_update extends EventName
  @scala.inline
  def department_update: department_update = "department_update".asInstanceOf[department_update]
  
  @js.native
  sealed trait error extends EventName
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait good extends StObject
  @scala.inline
  def good: good = "good".asInstanceOf[good]
  
  @js.native
  sealed trait history extends EventName
  @scala.inline
  def history: history = "history".asInstanceOf[history]
  
  @js.native
  sealed trait last_read extends StObject
  @scala.inline
  def last_read: last_read = "last_read".asInstanceOf[last_read]
  
  @js.native
  sealed trait offline extends EventData
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait online extends EventData
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait typing extends EventName
  @scala.inline
  def typing: typing = "typing".asInstanceOf[typing]
  
  @js.native
  sealed trait visitor_update extends EventName
  @scala.inline
  def visitor_update: visitor_update = "visitor_update".asInstanceOf[visitor_update]
}
