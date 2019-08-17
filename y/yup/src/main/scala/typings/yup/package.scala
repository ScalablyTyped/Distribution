package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yup {
  import typings.std.Exclude
  import typings.std.Partial
  import typings.std.Pick

  type NotRequiredProps[T] = Partial[
    Pick[
      T, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyOfUndefined<T> */ js.Any
    ]
  ]
  type RequiredProps[T] = Pick[
    T, 
    Exclude[
      String, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyOfUndefined<T> */ js.Any
    ]
  ]
}
