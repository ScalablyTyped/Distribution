package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsWithQuery
  extends BaseOptions
     with Options {
  
  var query: String = js.native
}
object OptionsWithQuery {
  
  @scala.inline
  def apply(query: String): OptionsWithQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithQuery]
  }
  
  @scala.inline
  implicit class OptionsWithQueryMutableBuilder[Self <: OptionsWithQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
