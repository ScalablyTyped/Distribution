package typings.yup.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.Extract
import typings.std.InstanceType
import typings.std.NonNullable
import typings.std.PropertyKey
import typings.std.Record
import typings.typeFest.sourceGetMod.Get
import typings.yup.anon.OPTIONS
import typings.yup.anon.Parent
import typings.yup.mod.^
import typings.yup.yupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addMethod[T /* <: Instantiable1[/* args */ Any, ISchema[Any, Any, Any, Any]] */](
  schemaType: T,
  name: String,
  fn: js.ThisFunction1[/* this */ InstanceType[T], /* repeated */ Any, InstanceType[T]]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMethod")(schemaType.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addMethod[T /* <: ISchema[Any, Any, Any, Any] */](
  schemaType: js.Function1[/* repeated */ Any, T],
  name: String,
  fn: js.ThisFunction1[/* this */ T, /* repeated */ Any, T]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMethod")(schemaType.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def defaultLocale: LocaleObject = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultLocale").asInstanceOf[LocaleObject]

inline def getIn[C](schema: Any, path: String): Parent = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Parent]
inline def getIn[C](schema: Any, path: String, value: Any): Parent = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Parent]
inline def getIn[C](schema: Any, path: String, value: Any, context: C): Parent = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Parent]
inline def getIn[C](schema: Any, path: String, value: Unit, context: C): Parent = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Parent]

inline def isSchema(obj: Any): /* is yup.yup.ISchema<any, any, any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSchema")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is yup.yup.ISchema<any, any, any, any> */ Boolean]

inline def `lazy`[TSchema /* <: ISchema[Any, TContext, Any, Any] */, TContext /* <: Maybe[AnyObject] */](builder: js.Function2[/* value */ Any, /* options */ ResolveOptions[TContext], TSchema]): Lazy_[InferType[TSchema], TContext, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(builder.asInstanceOf[js.Any]).asInstanceOf[Lazy_[InferType[TSchema], TContext, Any]]

inline def reach[P /* <: String */, S /* <: ISchema[Any, Any, Any, Any] */](obj: S, path: P): (Reference[Get[InferType[S], P, js.Object]]) | (ISchema[
Get[InferType[S], P, js.Object], 
/* import warning: importer.ImportType#apply Failed type conversion: S['__context'] */ js.Any, 
Any, 
Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("reach")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[(Reference[Get[InferType[S], P, js.Object]]) | (ISchema[
Get[InferType[S], P, js.Object], 
/* import warning: importer.ImportType#apply Failed type conversion: S['__context'] */ js.Any, 
Any, 
Any])]
inline def reach[P /* <: String */, S /* <: ISchema[Any, Any, Any, Any] */](obj: S, path: P, value: Any): (Reference[Get[InferType[S], P, js.Object]]) | (ISchema[
Get[InferType[S], P, js.Object], 
/* import warning: importer.ImportType#apply Failed type conversion: S['__context'] */ js.Any, 
Any, 
Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("reach")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[(Reference[Get[InferType[S], P, js.Object]]) | (ISchema[
Get[InferType[S], P, js.Object], 
/* import warning: importer.ImportType#apply Failed type conversion: S['__context'] */ js.Any, 
Any, 
Any])]
inline def reach[P /* <: String */, S /* <: ISchema[Any, Any, Any, Any] */](obj: S, path: P, value: Any, context: Any): (Reference[Get[InferType[S], P, js.Object]]) | (ISchema[
Get[InferType[S], P, js.Object], 
/* import warning: importer.ImportType#apply Failed type conversion: S['__context'] */ js.Any, 
Any, 
Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("reach")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[(Reference[Get[InferType[S], P, js.Object]]) | (ISchema[
Get[InferType[S], P, js.Object], 
/* import warning: importer.ImportType#apply Failed type conversion: S['__context'] */ js.Any, 
Any, 
Any])]
inline def reach[P /* <: String */, S /* <: ISchema[Any, Any, Any, Any] */](obj: S, path: P, value: Unit, context: Any): (Reference[Get[InferType[S], P, js.Object]]) | (ISchema[
Get[InferType[S], P, js.Object], 
/* import warning: importer.ImportType#apply Failed type conversion: S['__context'] */ js.Any, 
Any, 
Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("reach")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[(Reference[Get[InferType[S], P, js.Object]]) | (ISchema[
Get[InferType[S], P, js.Object], 
/* import warning: importer.ImportType#apply Failed type conversion: S['__context'] */ js.Any, 
Any, 
Any])]

inline def ref[TValue](key: String): Reference[TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any]).asInstanceOf[Reference[TValue]]
inline def ref[TValue](key: String, options: ReferenceOptions[TValue]): Reference[TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reference[TValue]]

inline def setLocale(custom: LocaleObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(custom.asInstanceOf[js.Any]).asInstanceOf[Unit]

type AnyObject = StringDictionary[Any]

type AnyObjectSchema = ObjectSchema[Any, Any, Any, Any]

type AnyPresentValue = js.Object

type AnySchema[TType, C, D, F /* <: Flags */] = Schema[TType, C, D, F]

type AnyTuple = Array[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  std.NonNullable<T> & std.NonNullable<U> extends never ? never : std.NonNullable<T> & std.NonNullable<U> | yup.yup.Optionals<U>
  }}}
  */
type Concat[T, U] = (NonNullable[T] & NonNullable[U]) | Optionals[U]

type ConcatObjectTypes[T /* <: Maybe[AnyObject] */, U /* <: Maybe[AnyObject] */] = ((/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P extends keyof std.NonNullable<U>? std.NonNullable<U>[P] : T[P]} */ js.Any) & U) | Optionals[U]

type ConditionBuilder[T /* <: ISchema[Any, Any, Any, Any] */] = js.Function3[
/* values */ js.Array[Any], 
/* schema */ T, 
/* options */ ResolveOptions[Any], 
ISchema[Any, Any, Any, Any]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends undefined ? never : T
  }}}
  */
type Defined[T] = T

type ExtraParams = Record[String, Any]

type InferType[T /* <: ISchema[Any, Any, Any, Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['__outputType'] */ js.Any

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends yup.yup.AnyObject ? yup.yup._<yup.yup.MakePartial<T>> : T
  }}}
  */
type MakeKeysOptional[T] = T

type Maybe[T] = js.UndefOr[T | Null]

type Message[Extra /* <: Record[String, Any] */] = String | (js.Function1[/* params */ Extra & MessageParams, Any]) | (Record[PropertyKey, Any])

type NextCallback = js.Function1[/* err */ js.Array[ValidationError] | ValidationError | Null, Unit]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends null ? never : T
  }}}
  */
type NotNull[T] = T

type ObjectShape = StringDictionary[(ISchema[Any, Any, Any, Any]) | Reference[Any]]

type OptionalKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: undefined extends T[k]? k : never}[keyof T] */ js.Any

type Optionals[T] = Extract[T, js.UndefOr[Null]]

type PanicCallback = js.Function1[/* err */ js.Error, Unit]

type Params = Record[String, Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends string | number | bigint | boolean | null | undefined | symbol | std.Date ? T | undefined : T extends std.Array<infer ArrayType> ? std.Array<yup.yup.PartialDeep<ArrayType>> : T extends std.ReadonlyArray<infer ArrayType> ? std.ReadonlyArray<ArrayType> : {[ K in keyof T ]:? yup.yup.PartialDeep<T[K]>}
  }}}
  */
type PartialDeep[T] = js.UndefOr[T]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends U ? U : never
  }}}
  */
type Preserve[T, U] = U

type RejectorFn = js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Boolean]

type RequiredKeys[T /* <: js.Object */] = Exclude[/* keyof T */ String, OptionalKeys[T]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  std.Extract<F, 'd'> extends never ? T : D extends undefined ? T : yup.yup.Defined<T>
  }}}
  */
type ResolveFlags[T, F /* <: Flags */, D] = T

type RunTest = js.Function3[
/* opts */ TestOptions[AnySchema[Any, Any, Any, Flags]], 
/* panic */ PanicCallback, 
/* next */ NextCallback, 
Unit]

type SetFlag[Old /* <: Flags */, F /* <: Flags */] = (Exclude[Old, _empty]) | F

type Test = (js.Function3[
/* opts */ TestOptions[AnySchema[Any, Any, Any, Flags]], 
/* panic */ PanicCallback, 
/* next */ NextCallback, 
Unit]) & OPTIONS

type TestFunction[T, TContext] = js.ThisFunction2[
/* this */ TestContext[TContext], 
/* value */ T, 
/* context */ TestContext[TContext], 
Unit | Boolean | ValidationError | (js.Promise[Boolean | ValidationError])]

type Thunk[T] = T | js.Function0[T]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  yup.yup.Preserve<D, undefined> extends never ? yup.yup.SetFlag<F, 'd'> : yup.yup.UnsetFlag<F, 'd'>
  }}}
  */
type ToggleDefault[F /* <: Flags */, D] = F

type TransformFunction[T /* <: AnySchema[Any, Any, Any, Flags] */] = js.ThisFunction3[/* this */ T, /* value */ Any, /* originalValue */ Any, /* schema */ T, Any]

type TypeGuard[TType] = js.Function1[/* value */ Any, /* is std.NonNullable<TType> */ Boolean]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  std.Exclude<Old, F> extends never ? '' : std.Exclude<Old, F>
  }}}
  */
type UnsetFlag[Old /* <: Flags */, F /* <: Flags */] = Old

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends {} ? {[ k in keyof T ]: T[k]} : T
  }}}
  */
type _underscore[T] = T
