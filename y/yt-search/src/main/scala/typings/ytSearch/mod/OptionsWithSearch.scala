package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithSearch
  extends BaseOptions
     with Options {
  var search: String = js.native
}

object OptionsWithSearch {
  @scala.inline
  def apply(search: String): OptionsWithSearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithSearch]
  }
  @scala.inline
  implicit class OptionsWithSearchOps[Self <: OptionsWithSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
  }
  
}

