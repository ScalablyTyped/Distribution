package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsWithQuery
  extends StObject
     with BaseOptions
     with Options {
  
  var query: String
}
object OptionsWithQuery {
  
  inline def apply(query: String): OptionsWithQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithQuery]
  }
  
  extension [Self <: OptionsWithQuery](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
