package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithSearch
  extends BaseOptions
     with Options {
  var search: String
}

object OptionsWithSearch {
  @scala.inline
  def apply(search: String, pageEnd: Int | Double = null, pageStart: Int | Double = null): OptionsWithSearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    if (pageEnd != null) __obj.updateDynamic("pageEnd")(pageEnd.asInstanceOf[js.Any])
    if (pageStart != null) __obj.updateDynamic("pageStart")(pageStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithSearch]
  }
}

