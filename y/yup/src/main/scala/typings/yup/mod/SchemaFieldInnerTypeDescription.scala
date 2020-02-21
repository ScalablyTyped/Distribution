package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'type' | 'label' | 'meta' | 'tests' | 'fields', 'fields'> ]: yup.yup.SchemaDescription[P]} */ trait SchemaFieldInnerTypeDescription extends SchemaFieldDescription {
  var innerType: js.UndefOr[SchemaFieldDescription] = js.undefined
}

object SchemaFieldInnerTypeDescription {
  @scala.inline
  def apply(innerType: SchemaFieldDescription = null): SchemaFieldInnerTypeDescription = {
    val __obj = js.Dynamic.literal()
    if (innerType != null) __obj.updateDynamic("innerType")(innerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldInnerTypeDescription]
  }
}

