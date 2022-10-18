package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an instance used to read or write unknown type of data.
  * 
  * zip.js can handle multiple types of data thanks to a generic API. This feature is based on 2 abstract constructors: `Reader` and `Writer`. 
  * The classes inheriting from `Reader` help to read data from a source of data. The classes inheriting from `Writer` help to write data into a destination.
  */
trait Initializable extends StObject {
  
  /**
    * Initializes the instance asynchronously
    */
  var init: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}
object Initializable {
  
  inline def apply(): Initializable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initializable]
  }
  
  extension [Self <: Initializable](x: Self) {
    
    inline def setInit(value: () => js.Promise[Unit]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
  }
}
