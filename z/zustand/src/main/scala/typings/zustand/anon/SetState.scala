package typings.zustand.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetState extends StObject {
  
  def setState(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param a because its type infer Sa is not an array type */ a: /* import warning: importer.ImportType#apply Failed type conversion: infer Sa */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: infer Sr */ js.Any
}
object SetState {
  
  inline def apply(
    setState: /* import warning: importer.ImportType#apply Failed type conversion: infer Sa */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer Sr */ js.Any
  ): SetState = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[SetState]
  }
  
  extension [Self <: SetState](x: Self) {
    
    inline def setSetState(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer Sa */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer Sr */ js.Any
    ): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
  }
}
