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
  def OptionsWithQuery(query: String, pageEnd: Int | Double = null, pageStart: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (pageEnd != null) __obj.updateDynamic("pageEnd")(pageEnd.asInstanceOf[js.Any])
    if (pageStart != null) __obj.updateDynamic("pageStart")(pageStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def OptionsWithSearch(search: String, pageEnd: Int | Double = null, pageStart: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    if (pageEnd != null) __obj.updateDynamic("pageEnd")(pageEnd.asInstanceOf[js.Any])
    if (pageStart != null) __obj.updateDynamic("pageStart")(pageStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

