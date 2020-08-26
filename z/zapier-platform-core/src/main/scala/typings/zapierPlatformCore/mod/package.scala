package typings.zapierPlatformCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AppError = typings.std.Error
  type DehydrateFunc = js.Function2[
    /* func */ js.Function2[
      /* z */ typings.zapierPlatformCore.mod.ZObject, 
      /* bundle */ typings.zapierPlatformCore.mod.Bundle[js.Any], 
      js.Any
    ], 
    /* inputData */ js.Object, 
    java.lang.String
  ]
  type ExpiredAuthError = typings.std.Error
  type HaltedError = typings.std.Error
  type RefreshAuthError = typings.std.Error
}
