package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ytSearch.mod.OptionsWithQuery
  - typings.ytSearch.mod.OptionsWithSearch
*/
trait Options extends StObject
object Options {
  
  @scala.inline
  def OptionsWithQuery(query: String): typings.ytSearch.mod.OptionsWithQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ytSearch.mod.OptionsWithQuery]
  }
  
  @scala.inline
  def OptionsWithSearch(search: String): typings.ytSearch.mod.OptionsWithSearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ytSearch.mod.OptionsWithSearch]
  }
}
