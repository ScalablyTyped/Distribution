package typings
package zchatDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var rating: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Comment {
  @scala.inline
  def apply(comment: java.lang.String = null, rating: java.lang.String = null): Anon_Comment = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (rating != null) __obj.updateDynamic("rating")(rating)
    __obj.asInstanceOf[Anon_Comment]
  }
}

