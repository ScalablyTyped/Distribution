package typings.zipcelxOnSteroids

import typings.zipcelxOnSteroids.mod.ZipCelXDataSet
import typings.zipcelxOnSteroids.mod.ZipCelXRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: ZipCelXDataSet
  }
  object Data {
    
    inline def apply(data: ZipCelXDataSet): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: ZipCelXDataSet): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ZipCelXRow*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
}
