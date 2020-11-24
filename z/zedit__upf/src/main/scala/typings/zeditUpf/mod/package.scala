package typings.zeditUpf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExectuteCTX[S, L] = js.Tuple4[typings.xelib.mod.FileHandle, typings.zeditUpf.mod.Helpers, S, L]
  
  type JSONAble = scala.Double | scala.Boolean | java.lang.String | scala.Null | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @zedit/upf.@zedit/upf.JSONAble */ js.Object
  ]) | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @zedit/upf.@zedit/upf.JSONAble */ js.Object
  ])
  
  type LegacyPatcher[S, L] = (typings.zeditUpf.mod.Patcher[S, L]) with (typings.zeditUpf.anon.RequiredFiles | (typings.zeditUpf.anon.Execute[S, L]))
  
  type ProcessBlock[S, L] = (typings.zeditUpf.anon.Load | (typings.zeditUpf.anon.Records[S, L])) with (typings.zeditUpf.anon.Patch[S, L])
}
