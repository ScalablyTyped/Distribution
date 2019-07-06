package typings
package zchatDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatrating extends js.Object {
  var new_rating: js.UndefOr[java.lang.String] = js.undefined
  var rating: js.UndefOr[java.lang.String] = js.undefined
  var `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.chatDOTrating
}

object Anon_Chatrating {
  @scala.inline
  def apply(
    `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.chatDOTrating,
    new_rating: java.lang.String = null,
    rating: java.lang.String = null
  ): Anon_Chatrating = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (new_rating != null) __obj.updateDynamic("new_rating")(new_rating)
    if (rating != null) __obj.updateDynamic("rating")(rating)
    __obj.asInstanceOf[Anon_Chatrating]
  }
}

