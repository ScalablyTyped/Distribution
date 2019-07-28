package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserStrings.chatDOTrating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatrating extends js.Object {
  var new_rating: js.UndefOr[String] = js.undefined
  var rating: js.UndefOr[String] = js.undefined
  var `type`: chatDOTrating
}

object Anon_Chatrating {
  @scala.inline
  def apply(`type`: chatDOTrating, new_rating: String = null, rating: String = null): Anon_Chatrating = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (new_rating != null) __obj.updateDynamic("new_rating")(new_rating)
    if (rating != null) __obj.updateDynamic("rating")(rating)
    __obj.asInstanceOf[Anon_Chatrating]
  }
}

