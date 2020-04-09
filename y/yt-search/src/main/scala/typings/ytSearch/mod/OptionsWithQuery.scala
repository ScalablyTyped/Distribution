package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithQuery
  extends BaseOptions
     with Options {
  var query: String
}

object OptionsWithQuery {
  @scala.inline
  def apply(query: String, pageEnd: Int | Double = null, pageStart: Int | Double = null): OptionsWithQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (pageEnd != null) __obj.updateDynamic("pageEnd")(pageEnd.asInstanceOf[js.Any])
    if (pageStart != null) __obj.updateDynamic("pageStart")(pageStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithQuery]
  }
}

