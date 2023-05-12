package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof S ]: S[K] extends yup.yup.ISchema<any, any, any, any>? yup.yup.ResolveStrip<S[K]> : S[K] extends yup.yup.Reference<infer T>? T : unknown}
  }}}
  */
@js.native
trait TypeFromShape[S /* <: ObjectShape */, _C] extends StObject
