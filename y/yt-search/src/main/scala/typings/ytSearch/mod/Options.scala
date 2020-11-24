package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ytSearch.mod.OptionsWithQuery
  - typings.ytSearch.mod.OptionsWithSearch
*/
trait Options extends js.Object
object Options {
  
  @scala.inline
  def OptionsWithQuery(query: String): Options = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  def OptionsWithSearch(search: String): Options = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}
