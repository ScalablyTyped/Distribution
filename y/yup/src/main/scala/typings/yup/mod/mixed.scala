package typings.yup.mod

import typings.yup.anon.Dictkey
import typings.yup.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("yup", "mixed")
@js.native
// tslint:disable-next-line:no-unnecessary-generics
class mixed[T, C] ()
  extends StObject
     with MixedSchema[T, C] {
  def this(options: Dictkey) = this()
}
object mixed {
  
  inline def apply: MixedSchemaConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("mixed").asInstanceOf[MixedSchemaConstructor]
}
