package typings.zustand.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStateSetState extends StObject {
  
  def getState(): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  
  var setState: /* import warning: importer.ImportType#apply Failed type conversion: infer SetState */ js.Any
}
object GetStateSetState {
  
  inline def apply(
    getState: () => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any,
    setState: /* import warning: importer.ImportType#apply Failed type conversion: infer SetState */ js.Any
  ): GetStateSetState = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = setState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStateSetState]
  }
  
  extension [Self <: GetStateSetState](x: Self) {
    
    inline def setGetState(
      value: () => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSetState(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer SetState */ js.Any
    ): Self = StObject.set(x, "setState", value.asInstanceOf[js.Any])
  }
}
