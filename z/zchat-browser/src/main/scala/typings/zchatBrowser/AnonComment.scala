package typings.zchatBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComment extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var rating: js.UndefOr[String] = js.undefined
}

object AnonComment {
  @scala.inline
  def apply(comment: String = null, rating: String = null): AnonComment = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComment]
  }
}

