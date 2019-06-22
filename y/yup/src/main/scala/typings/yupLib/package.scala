package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yupLib {
  type NotRequiredProps[T] = stdLib.Partial[
    stdLib.Pick[
      T, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyOfUndefined<T> */ js.Any
    ]
  ]
  type RequiredProps[T] = stdLib.Pick[
    T, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyOfUndefined<T> */ js.Any
    ]
  ]
}
