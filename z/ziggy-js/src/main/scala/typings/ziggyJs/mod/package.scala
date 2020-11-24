package typings.ziggyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EncodeURIParamType = java.lang.String | scala.Double | scala.Boolean
  
  type InputParams = typings.ziggyJs.mod.NormalizedParams | typings.ziggyJs.mod.InputValue
  
  type InputValue = typings.ziggyJs.anon.Id | typings.ziggyJs.mod.EncodeURIParamType
  
  type NormalizedParams = org.scalablytyped.runtime.StringDictionary[typings.ziggyJs.mod.InputValue] | js.Array[typings.ziggyJs.mod.InputValue]
}
