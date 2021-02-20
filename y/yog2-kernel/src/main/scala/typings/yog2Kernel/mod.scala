package typings.yog2Kernel

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Express
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.IRouter
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.lodash.mod.Collection
import typings.lodash.mod.Function
import typings.lodash.mod.List
import typings.lodash.mod.LoDashStatic
import typings.lodash.mod.Object
import typings.lodash.mod.Primitive
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import typings.yog2Kernel.anon.CleanCache
import typings.yog2Kernel.anon.TypeofRAL
import typings.yog2Kernel.anon.TypeofRALPromise
import typings.yogBigpipe.mod.BigPipe
import typings.yogLog.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("yog2-kernel", JSImport.Namespace)
  @js.native
  val ^ : Yog = js.native
  
  @js.native
  trait ActionObject
    extends /* key */ StringDictionary[js.Any] {
    
    var copy: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var del: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var delete: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var get: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var head: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var link: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var lock: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var options: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var patch: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var post: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var propfind: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var purge: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var put: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var unlick: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var unlock: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var view: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  }
  object ActionObject {
    
    @scala.inline
    def apply(): ActionObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionObject]
    }
    
    @scala.inline
    implicit class ActionObjectMutableBuilder[Self <: ActionObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "copy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDel(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "del", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      @scala.inline
      def setDelete(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "delete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setGet(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setHead(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "head", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setLink(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "link", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setLock(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "lock", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      @scala.inline
      def setOptions(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "options", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPatch(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "patch", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setPost(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "post", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPropfind(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "propfind", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPropfindUndefined: Self = StObject.set(x, "propfind", js.undefined)
      
      @scala.inline
      def setPurge(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "purge", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPurgeUndefined: Self = StObject.set(x, "purge", js.undefined)
      
      @scala.inline
      def setPut(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      @scala.inline
      def setUnlick(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "unlick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnlickUndefined: Self = StObject.set(x, "unlick", js.undefined)
      
      @scala.inline
      def setUnlock(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "unlock", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnlockUndefined: Self = StObject.set(x, "unlock", js.undefined)
      
      @scala.inline
      def setView(
        value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "view", js.Any.fromFunction3(value))
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  @js.native
  trait Request
    extends typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    var CURRENT_APP: String = js.native
    
    var ral: TypeofRAL = js.native
    
    var ralP: TypeofRALPromise = js.native
  }
  
  @js.native
  trait Response
    extends typings.expressServeStaticCore.mod.Response[js.Any, Double] {
    
    var bigpipe: BigPipe = js.native
  }
  
  @js.native
  trait Router extends IRouter {
    
    def action(actionName: String): (RequestHandler[ParamsDictionary, _, _, Query]) | ActionObject = js.native
    
    def wrapAsync(
      fn: js.Function3[/* req */ Request, /* resp */ Response, /* next */ typings.express.mod.NextFunction, _]
    ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
  
  @js.native
  trait Yog extends StObject {
    
    var DEBUG: Boolean = js.native
    
    var PLUGINS_PATH: String = js.native
    
    var PLUGIN_TIMEOUT: String | Double = js.native
    
    var RAL: TypeofRAL = js.native
    
    var ROOT_PATH: String = js.native
    
    @JSName("_")
    def _underscore(): typings.lodash.mod.String = js.native
    @JSName("_")
    def _underscore(value: String): typings.lodash.mod.String = js.native
    @JSName("_")
    def _underscore[T /* <: js.Object */](value: T): Object[T] = js.native
    @JSName("_")
    def _underscore[T](value: List[T]): Collection[T] = js.native
    @JSName("_")
    var _underscore_Original: LoDashStatic = js.native
    @JSName("_")
    def _underscore_T_Collection[T](): Collection[T] = js.native
    @JSName("_")
    def _underscore_T_Function1AnyWildcard_Function[T /* <: js.Function1[/* args */ js.Any, _] */](value: T): Function[T] = js.native
    @JSName("_")
    def _underscore_T_Object_Object[T /* <: js.Object */](): Object[T] = js.native
    @JSName("_")
    def _underscore_T_Primitive[T](value: T): Primitive[T] = js.native
    @JSName("_")
    def `_underscore_T_UnionNull<undefined>_Primitive`[T /* <: js.UndefOr[Null] */](value: T): Primitive[T] = js.native
    /**
      * Creates a lodash object which wraps value to enable implicit method chain sequences.
      * Methods that operate on and return arrays, collections, and functions can be chained together.
      * Methods that retrieve a single value or may return a primitive value will automatically end the
      * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
      *
      * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
      *
      * The execution of chained methods is lazy, that is, it's deferred until value() is
      * implicitly or explicitly called.
      *
      * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
      * is an optimization to merge iteratee calls; this avoids the creation of intermediate
      * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
      * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
      * accept only one argument. The heuristic for whether a section qualifies for shortcut
      * fusion is subject to change.
      *
      * Chaining is supported in custom builds as long as the value() method is directly or
      * indirectly included in the build.
      *
      * In addition to lodash methods, wrappers have Array and String methods.
      * The wrapper Array methods are:
      * concat, join, pop, push, shift, sort, splice, and unshift.
      * The wrapper String methods are:
      * replace and split.
      *
      * The wrapper methods that support shortcut fusion are:
      * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
      * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
      *
      * The chainable wrapper methods are:
      * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
      * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
      * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
      * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
      * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
      * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
      * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
      * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
      * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
      * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
      * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
      * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
      * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
      * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
      * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
      * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
      *
      * The wrapper methods that are not chainable by default are:
      * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
      * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
      * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
      * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
      * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
      * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
      * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
      * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
      * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
      * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
      * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
      * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
      * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
      * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
      * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
      * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
      * upperFirst, value, and words.
      **/
    @JSName("_")
    def _underscore_TrapAny_TrapAny_Intersection[TrapAny /* <: typings.lodash.anon.TrapAny */](value: TrapAny): Collection[_] with Function[_] with Object[_] with Primitive[_] with typings.lodash.mod.String = js.native
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(
      req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, ParsedQs],
      res: typings.expressServeStaticCore.mod.Response[_, Double]
    ): js.Any = js.native
    def app(
      req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, ParsedQs],
      res: ServerResponse
    ): js.Any = js.native
    def app(req: IncomingMessage, res: typings.expressServeStaticCore.mod.Response[_, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    def bootstrap(option: YogBootstrapOption): Unit = js.native
    def bootstrap(option: YogBootstrapOption, callback: js.Function0[Unit]): Unit = js.native
    
    def express(): typings.expressServeStaticCore.mod.Express = js.native
    @JSName("express")
    var express_Original: js.Function0[typings.expressServeStaticCore.mod.Express] = js.native
    
    var log: Logger = js.native
    
    // 当 yog.conf.promise.overrideRAL 为true时，可以当作promise使用
    var ral: TypeofRAL | TypeofRALPromise = js.native
    
    var ralP: TypeofRALPromise = js.native
    
    // debug模式时存在
    var reloadApp: js.UndefOr[js.Function1[/* appName */ String, Unit]] = js.native
    
    // debug模式时存在
    var reloadIsomorphic: js.UndefOr[js.Function0[Unit]] = js.native
    
    // debug模式时存在
    var reloadView: js.UndefOr[js.Function0[Unit]] = js.native
    
    def require(moduleName: String): js.Any = js.native
    
    var view: CleanCache = js.native
  }
  
  @js.native
  trait YogBootstrapOption extends StObject {
    
    // 设置app，未设置则直接使用express
    var app: js.UndefOr[Express] = js.native
    
    // 设置conf目录
    var confPath: js.UndefOr[String] = js.native
    
    // 设置plugins目录
    var pluginsPath: js.UndefOr[String] = js.native
    
    // 设置yog根目录，默认使用启动文件的目录
    var rootPath: js.UndefOr[String] = js.native
  }
  object YogBootstrapOption {
    
    @scala.inline
    def apply(): YogBootstrapOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YogBootstrapOption]
    }
    
    @scala.inline
    implicit class YogBootstrapOptionMutableBuilder[Self <: YogBootstrapOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: Express): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setConfPath(value: String): Self = StObject.set(x, "confPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfPathUndefined: Self = StObject.set(x, "confPath", js.undefined)
      
      @scala.inline
      def setPluginsPath(value: String): Self = StObject.set(x, "pluginsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsPathUndefined: Self = StObject.set(x, "pluginsPath", js.undefined)
      
      @scala.inline
      def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
    }
  }
  
  type _To = Yog
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Yog = ^
}
