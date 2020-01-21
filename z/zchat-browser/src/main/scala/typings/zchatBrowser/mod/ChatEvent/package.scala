package typings.zchatBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChatEvent {
  type ChatEventData = (typings.zchatBrowser.mod.ChatEvent.BaseChatEventData with typings.zchatBrowser.AnonChatmsg) | (typings.zchatBrowser.mod.ChatEvent.BaseChatEventData with typings.zchatBrowser.AnonAttachment) | (typings.zchatBrowser.mod.ChatEvent.BaseChatEventData with typings.zchatBrowser.AnonChatmemberjoin) | (typings.zchatBrowser.mod.ChatEvent.BaseChatEventData with typings.zchatBrowser.AnonChatmemberleave) | (typings.zchatBrowser.mod.ChatEvent.BaseChatEventData with typings.zchatBrowser.AnonChatrequestrating) | (typings.zchatBrowser.mod.ChatEvent.BaseChatEventData with typings.zchatBrowser.AnonChatrating) | (typings.zchatBrowser.mod.ChatEvent.BaseChatEventData with typings.zchatBrowser.AnonChatcomment)
}
