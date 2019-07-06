package typings
package zchatDashBrowserLib.zchatDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChatEventNs {
  type ChatEventData = BaseChatEventData with (zchatDashBrowserLib.Anon_Chatmsg | BaseChatEventData) with (zchatDashBrowserLib.Anon_Attachment | BaseChatEventData) with (zchatDashBrowserLib.Anon_Chatmemberjoin | BaseChatEventData) with (zchatDashBrowserLib.Anon_Chatmemberleave | BaseChatEventData) with (zchatDashBrowserLib.Anon_Chatrequestrating | BaseChatEventData) with (zchatDashBrowserLib.Anon_Chatrating | BaseChatEventData) with zchatDashBrowserLib.Anon_Chatcomment
}
