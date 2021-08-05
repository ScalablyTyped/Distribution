package typings.yup.mod

import typings.yup.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("yup", "string")
@js.native
// tslint:disable-next-line:no-unnecessary-generics
class string[T /* <: js.UndefOr[String | Null] */, C] ()
  extends StObject
     with StringSchema[T, C]
object string {
  
  inline def apply: StringSchemaConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("string").asInstanceOf[StringSchemaConstructor]
}
