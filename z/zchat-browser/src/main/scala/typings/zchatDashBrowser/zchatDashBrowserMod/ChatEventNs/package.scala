package typings.zchatDashBrowser.zchatDashBrowserMod

import typings.zchatDashBrowser.Anon_Attachment
import typings.zchatDashBrowser.Anon_Chatcomment
import typings.zchatDashBrowser.Anon_Chatmemberjoin
import typings.zchatDashBrowser.Anon_Chatmemberleave
import typings.zchatDashBrowser.Anon_Chatmsg
import typings.zchatDashBrowser.Anon_Chatrating
import typings.zchatDashBrowser.Anon_Chatrequestrating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChatEventNs {
  type ChatEventData = (BaseChatEventData with Anon_Chatmsg) | (BaseChatEventData with Anon_Attachment) | (BaseChatEventData with Anon_Chatmemberjoin) | (BaseChatEventData with Anon_Chatmemberleave) | (BaseChatEventData with Anon_Chatrequestrating) | (BaseChatEventData with Anon_Chatrating) | (BaseChatEventData with Anon_Chatcomment)
}
