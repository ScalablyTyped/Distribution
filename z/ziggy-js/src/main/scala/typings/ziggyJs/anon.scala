package typings.ziggyJs

import typings.ziggyJs.mod.QueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Query extends StObject {
    
    var _query: QueryParams
  }
  object Query {
    
    inline def apply(_query: QueryParams): Query = {
      val __obj = js.Dynamic.literal(_query = _query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def set_query(value: QueryParams): Self = StObject.set(x, "_query", value.asInstanceOf[js.Any])
    }
  }
}
