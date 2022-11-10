package typings.zinggrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends / * template literal string: ${inferL}${Upper}${inferR} * / string ? T extends / * template literal string: ${L}${inferU}${R} * / string ? / * template literal string: ${L}-${Lowercase<U>}${Kebab<R>} * / string : T : T
  }}}
  */
type Kebab[T /* <: String */] = T

type ZingGrid = typings.zinggrid.ZSoft.ZingGrid
