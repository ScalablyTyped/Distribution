package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ytSearch.mod.OptionsWithQuery
  - typings.ytSearch.mod.OptionsWithSearch
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def OptionsWithQuery(
    query: String,
    pageEnd: js.UndefOr[Double] = js.undefined,
    pageStart: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (!js.isUndefined(pageEnd)) __obj.updateDynamic("pageEnd")(pageEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageStart)) __obj.updateDynamic("pageStart")(pageStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def OptionsWithSearch(
    search: String,
    pageEnd: js.UndefOr[Double] = js.undefined,
    pageStart: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    if (!js.isUndefined(pageEnd)) __obj.updateDynamic("pageEnd")(pageEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageStart)) __obj.updateDynamic("pageStart")(pageStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

