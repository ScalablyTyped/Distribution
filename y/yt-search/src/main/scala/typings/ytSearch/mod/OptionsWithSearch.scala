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
  def apply(
    search: String,
    pageEnd: js.UndefOr[Double] = js.undefined,
    pageStart: js.UndefOr[Double] = js.undefined
  ): OptionsWithSearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    if (!js.isUndefined(pageEnd)) __obj.updateDynamic("pageEnd")(pageEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageStart)) __obj.updateDynamic("pageStart")(pageStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithSearch]
  }
}

