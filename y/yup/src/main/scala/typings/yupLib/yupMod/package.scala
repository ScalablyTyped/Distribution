package typings
package yupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yupMod {
  type AnySchemaConstructor = MixedSchemaConstructor | StringSchemaConstructor | NumberSchemaConstructor | BooleanSchemaConstructor | DateSchemaConstructor | ArraySchemaConstructor | ObjectSchemaConstructor
  type BooleanSchema = Schema[scala.Boolean]
  type Lazy = Schema[js.Any]
  type MixedSchema = Schema[js.Any]
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  type WhenOptions[T] = WhenOptionsBuilder[T] | yupLib.Anon_Then | js.Object
}
