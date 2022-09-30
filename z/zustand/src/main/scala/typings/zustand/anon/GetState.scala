package typings.zustand.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetState extends StObject {
  
  def getState(): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}
object GetState {
  
  inline def apply(
    getState: () => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): GetState = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GetState]
  }
  
  extension [Self <: GetState](x: Self) {
    
    inline def setGetState(
      value: () => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
