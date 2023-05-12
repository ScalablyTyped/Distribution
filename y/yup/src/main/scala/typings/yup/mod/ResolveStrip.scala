package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends yup.yup.ISchema<any, any, infer F, any> ? std.Extract<F, 's'> extends never ? T['__outputType'] : never : T['__outputType']
  }}}
  */
@js.native
trait ResolveStrip[T /* <: ISchema[Any, Any, Any, Any] */] extends StObject
