package typings.zchatBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var rating: js.UndefOr[String] = js.undefined
}

object Comment {
  @scala.inline
  def apply(comment: String = null, rating: String = null): Comment = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

