package com.suleymancelik.github.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0003\b\u00b2\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00cd\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0019\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0001\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0019\u0012\u0006\u0010;\u001a\u00020<\u0012\u0006\u0010=\u001a\u00020\u0005\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0019\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010C\u001a\u00020\u0019\u0012\u0006\u0010D\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020\u0003\u0012\u0006\u0010F\u001a\u00020\u0003\u0012\u0006\u0010G\u001a\u00020\u0003\u0012\u0006\u0010H\u001a\u00020\u0003\u0012\u0006\u0010I\u001a\u00020\u0003\u0012\u0006\u0010J\u001a\u00020\u0003\u0012\u0006\u0010K\u001a\u00020\u0003\u0012\u0006\u0010L\u001a\u00020\u0003\u0012\u0006\u0010M\u001a\u00020\u0003\u0012\u0006\u0010N\u001a\u00020\u0019\u0012\u0006\u0010O\u001a\u00020\u0019\u00a2\u0006\u0002\u0010PJ\n\u0010\u00a0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c7\u0001\u001a\u000202H\u00c6\u0003J\n\u0010\u00c8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ca\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00cb\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cc\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cd\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ce\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cf\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00d0\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00d1\u0001\u001a\u00020<H\u00c6\u0003J\n\u0010\u00d2\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00d3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d6\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00d7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d9\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00da\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00db\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00dc\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00dd\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00de\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00df\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e5\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00e6\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00e7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e8\u0001\u001a\u00020\u0003H\u00c6\u0003J\u00e4\u0005\u0010\u00e9\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00012\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\u00192\b\b\u0002\u0010:\u001a\u00020\u00192\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020\u00052\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00192\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\u00192\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00032\b\b\u0002\u0010K\u001a\u00020\u00032\b\b\u0002\u0010L\u001a\u00020\u00032\b\b\u0002\u0010M\u001a\u00020\u00032\b\b\u0002\u0010N\u001a\u00020\u00192\b\b\u0002\u0010O\u001a\u00020\u0019H\u00c6\u0001J\u0015\u0010\u00ea\u0001\u001a\u00020\u00052\t\u0010\u00eb\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00ec\u0001\u001a\u00020\u0019H\u00d6\u0001J\n\u0010\u00ed\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010RR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010RR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010RR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010RR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010RR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010RR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010RR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010RR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010RR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010RR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010RR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010RR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010RR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010RR\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010TR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010RR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010RR\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010TR\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0016\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010hR\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010RR\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010RR\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010RR\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010RR\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010RR\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010RR\u0016\u0010!\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010TR\u0016\u0010\"\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010TR\u0016\u0010#\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010TR\u0016\u0010$\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010TR\u0016\u0010%\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010TR\u0016\u0010&\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010RR\u0016\u0010\'\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010RR\u0016\u0010(\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010RR\u0016\u0010)\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010hR\u0016\u0010*\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010RR\u0016\u0010+\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010RR\u0016\u0010,\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010RR\u0016\u0010-\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010RR\u0016\u0010.\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010RR\u0016\u0010/\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010RR\u0016\u00100\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010RR\u0018\u00101\u001a\u0002028\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u00103\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010RR\u0017\u00104\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010RR\u0018\u00105\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u00106\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010RR\u0017\u00107\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010RR\u0017\u00108\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010RR\u0017\u00109\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010hR\u0017\u0010:\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010hR\u0018\u0010;\u001a\u00020<8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010=\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010TR\u0017\u0010>\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010RR\u0017\u0010?\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010RR\u0017\u0010@\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010RR\u0017\u0010A\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010hR\u0017\u0010B\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010RR\u0017\u0010C\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010hR\u0017\u0010D\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010RR\u0017\u0010E\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010RR\u0017\u0010F\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010RR\u0017\u0010G\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010RR\u0017\u0010H\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010RR\u0017\u0010I\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010RR\u0017\u0010J\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010RR\u0017\u0010K\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010RR\u0017\u0010L\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010RR\u0017\u0010M\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010RR\u0017\u0010N\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010hR\u0017\u0010O\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010h\u00a8\u0006\u00ee\u0001"}, d2 = {"Lcom/suleymancelik/github/data/repo/RepoListModelItem;", "", "archiveUrl", "", "archived", "", "assigneesUrl", "blobsUrl", "branchesUrl", "cloneUrl", "collaboratorsUrl", "commentsUrl", "commitsUrl", "compareUrl", "contentsUrl", "contributorsUrl", "createdAt", "defaultBranch", "deploymentsUrl", "description", "disabled", "downloadsUrl", "eventsUrl", "fork", "forks", "", "forksCount", "forksUrl", "fullName", "gitCommitsUrl", "gitRefsUrl", "gitTagsUrl", "gitUrl", "hasDownloads", "hasIssues", "hasPages", "hasProjects", "hasWiki", "homepage", "hooksUrl", "htmlUrl", "id", "issueCommentUrl", "issueEventsUrl", "issuesUrl", "keysUrl", "labelsUrl", "language", "languagesUrl", "license", "Lcom/suleymancelik/github/data/repo/License;", "mergesUrl", "milestonesUrl", "mirrorUrl", "name", "nodeId", "notificationsUrl", "openIssues", "openIssuesCount", "owner", "Lcom/suleymancelik/github/data/repo/Owner;", "private", "pullsUrl", "pushedAt", "releasesUrl", "size", "sshUrl", "stargazersCount", "stargazersUrl", "statusesUrl", "subscribersUrl", "subscriptionUrl", "svnUrl", "tagsUrl", "teamsUrl", "treesUrl", "updatedAt", "url", "watchers", "watchersCount", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/suleymancelik/github/data/repo/License;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/suleymancelik/github/data/repo/Owner;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getArchiveUrl", "()Ljava/lang/String;", "getArchived", "()Z", "getAssigneesUrl", "getBlobsUrl", "getBranchesUrl", "getCloneUrl", "getCollaboratorsUrl", "getCommentsUrl", "getCommitsUrl", "getCompareUrl", "getContentsUrl", "getContributorsUrl", "getCreatedAt", "getDefaultBranch", "getDeploymentsUrl", "getDescription", "getDisabled", "getDownloadsUrl", "getEventsUrl", "getFork", "getForks", "()I", "getForksCount", "getForksUrl", "getFullName", "getGitCommitsUrl", "getGitRefsUrl", "getGitTagsUrl", "getGitUrl", "getHasDownloads", "getHasIssues", "getHasPages", "getHasProjects", "getHasWiki", "getHomepage", "getHooksUrl", "getHtmlUrl", "getId", "getIssueCommentUrl", "getIssueEventsUrl", "getIssuesUrl", "getKeysUrl", "getLabelsUrl", "getLanguage", "getLanguagesUrl", "getLicense", "()Lcom/suleymancelik/github/data/repo/License;", "getMergesUrl", "getMilestonesUrl", "getMirrorUrl", "()Ljava/lang/Object;", "getName", "getNodeId", "getNotificationsUrl", "getOpenIssues", "getOpenIssuesCount", "getOwner", "()Lcom/suleymancelik/github/data/repo/Owner;", "getPrivate", "getPullsUrl", "getPushedAt", "getReleasesUrl", "getSize", "getSshUrl", "getStargazersCount", "getStargazersUrl", "getStatusesUrl", "getSubscribersUrl", "getSubscriptionUrl", "getSvnUrl", "getTagsUrl", "getTeamsUrl", "getTreesUrl", "getUpdatedAt", "getUrl", "getWatchers", "getWatchersCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_debug"})
public final class RepoListModelItem {
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "archive_url")
    private final java.lang.String archiveUrl = null;
    @com.squareup.moshi.Json(name = "archived")
    private final boolean archived = false;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "assignees_url")
    private final java.lang.String assigneesUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "blobs_url")
    private final java.lang.String blobsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "branches_url")
    private final java.lang.String branchesUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "clone_url")
    private final java.lang.String cloneUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "collaborators_url")
    private final java.lang.String collaboratorsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "comments_url")
    private final java.lang.String commentsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "commits_url")
    private final java.lang.String commitsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "compare_url")
    private final java.lang.String compareUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "contents_url")
    private final java.lang.String contentsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "contributors_url")
    private final java.lang.String contributorsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "created_at")
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "default_branch")
    private final java.lang.String defaultBranch = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "deployments_url")
    private final java.lang.String deploymentsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "description")
    private final java.lang.String description = null;
    @com.squareup.moshi.Json(name = "disabled")
    private final boolean disabled = false;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "downloads_url")
    private final java.lang.String downloadsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "events_url")
    private final java.lang.String eventsUrl = null;
    @com.squareup.moshi.Json(name = "fork")
    private final boolean fork = false;
    @com.squareup.moshi.Json(name = "forks")
    private final int forks = 0;
    @com.squareup.moshi.Json(name = "forks_count")
    private final int forksCount = 0;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "forks_url")
    private final java.lang.String forksUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "full_name")
    private final java.lang.String fullName = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "git_commits_url")
    private final java.lang.String gitCommitsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "git_refs_url")
    private final java.lang.String gitRefsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "git_tags_url")
    private final java.lang.String gitTagsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "git_url")
    private final java.lang.String gitUrl = null;
    @com.squareup.moshi.Json(name = "has_downloads")
    private final boolean hasDownloads = false;
    @com.squareup.moshi.Json(name = "has_issues")
    private final boolean hasIssues = false;
    @com.squareup.moshi.Json(name = "has_pages")
    private final boolean hasPages = false;
    @com.squareup.moshi.Json(name = "has_projects")
    private final boolean hasProjects = false;
    @com.squareup.moshi.Json(name = "has_wiki")
    private final boolean hasWiki = false;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "homepage")
    private final java.lang.String homepage = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "hooks_url")
    private final java.lang.String hooksUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "html_url")
    private final java.lang.String htmlUrl = null;
    @com.squareup.moshi.Json(name = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "issue_comment_url")
    private final java.lang.String issueCommentUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "issue_events_url")
    private final java.lang.String issueEventsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "issues_url")
    private final java.lang.String issuesUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "keys_url")
    private final java.lang.String keysUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "labels_url")
    private final java.lang.String labelsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "language")
    private final java.lang.String language = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "languages_url")
    private final java.lang.String languagesUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "license")
    private final com.suleymancelik.github.data.repo.License license = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "merges_url")
    private final java.lang.String mergesUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "milestones_url")
    private final java.lang.String milestonesUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "mirror_url")
    private final java.lang.Object mirrorUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "node_id")
    private final java.lang.String nodeId = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "notifications_url")
    private final java.lang.String notificationsUrl = null;
    @com.squareup.moshi.Json(name = "open_issues")
    private final int openIssues = 0;
    @com.squareup.moshi.Json(name = "open_issues_count")
    private final int openIssuesCount = 0;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "owner")
    private final com.suleymancelik.github.data.repo.Owner owner = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "pulls_url")
    private final java.lang.String pullsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "pushed_at")
    private final java.lang.String pushedAt = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "releases_url")
    private final java.lang.String releasesUrl = null;
    @com.squareup.moshi.Json(name = "size")
    private final int size = 0;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "ssh_url")
    private final java.lang.String sshUrl = null;
    @com.squareup.moshi.Json(name = "stargazers_count")
    private final int stargazersCount = 0;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "stargazers_url")
    private final java.lang.String stargazersUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "statuses_url")
    private final java.lang.String statusesUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "subscribers_url")
    private final java.lang.String subscribersUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "subscription_url")
    private final java.lang.String subscriptionUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "svn_url")
    private final java.lang.String svnUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "tags_url")
    private final java.lang.String tagsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "teams_url")
    private final java.lang.String teamsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "trees_url")
    private final java.lang.String treesUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "updated_at")
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "url")
    private final java.lang.String url = null;
    @com.squareup.moshi.Json(name = "watchers")
    private final int watchers = 0;
    @com.squareup.moshi.Json(name = "watchers_count")
    private final int watchersCount = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArchiveUrl() {
        return null;
    }
    
    public final boolean getArchived() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAssigneesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlobsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBranchesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCloneUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCollaboratorsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommentsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommitsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompareUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContentsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContributorsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultBranch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeploymentsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final boolean getDisabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDownloadsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEventsUrl() {
        return null;
    }
    
    public final boolean getFork() {
        return false;
    }
    
    public final int getForks() {
        return 0;
    }
    
    public final int getForksCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getForksUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGitCommitsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGitRefsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGitTagsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGitUrl() {
        return null;
    }
    
    public final boolean getHasDownloads() {
        return false;
    }
    
    public final boolean getHasIssues() {
        return false;
    }
    
    public final boolean getHasPages() {
        return false;
    }
    
    public final boolean getHasProjects() {
        return false;
    }
    
    public final boolean getHasWiki() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHooksUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHtmlUrl() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIssueCommentUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIssueEventsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIssuesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeysUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabelsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguagesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.suleymancelik.github.data.repo.License getLicense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMergesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMilestonesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMirrorUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNodeId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotificationsUrl() {
        return null;
    }
    
    public final int getOpenIssues() {
        return 0;
    }
    
    public final int getOpenIssuesCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.suleymancelik.github.data.repo.Owner getOwner() {
        return null;
    }
    
    public final boolean getPrivate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPullsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPushedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleasesUrl() {
        return null;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSshUrl() {
        return null;
    }
    
    public final int getStargazersCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStargazersUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubscribersUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubscriptionUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSvnUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTagsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTeamsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTreesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final int getWatchers() {
        return 0;
    }
    
    public final int getWatchersCount() {
        return 0;
    }
    
    public RepoListModelItem(@org.jetbrains.annotations.NotNull()
    java.lang.String archiveUrl, boolean archived, @org.jetbrains.annotations.NotNull()
    java.lang.String assigneesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String blobsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String branchesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String cloneUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String collaboratorsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String commentsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String commitsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String compareUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String contentsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String contributorsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultBranch, @org.jetbrains.annotations.NotNull()
    java.lang.String deploymentsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean disabled, @org.jetbrains.annotations.NotNull()
    java.lang.String downloadsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String eventsUrl, boolean fork, int forks, int forksCount, @org.jetbrains.annotations.NotNull()
    java.lang.String forksUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.NotNull()
    java.lang.String gitCommitsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String gitRefsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String gitTagsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String gitUrl, boolean hasDownloads, boolean hasIssues, boolean hasPages, boolean hasProjects, boolean hasWiki, @org.jetbrains.annotations.NotNull()
    java.lang.String homepage, @org.jetbrains.annotations.NotNull()
    java.lang.String hooksUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlUrl, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String issueCommentUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String issueEventsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String issuesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String keysUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String labelsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String languagesUrl, @org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.data.repo.License license, @org.jetbrains.annotations.NotNull()
    java.lang.String mergesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String milestonesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.Object mirrorUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String nodeId, @org.jetbrains.annotations.NotNull()
    java.lang.String notificationsUrl, int openIssues, int openIssuesCount, @org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.data.repo.Owner owner, boolean p54_1990234817, @org.jetbrains.annotations.NotNull()
    java.lang.String pullsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String pushedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String releasesUrl, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String sshUrl, int stargazersCount, @org.jetbrains.annotations.NotNull()
    java.lang.String stargazersUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String statusesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String subscribersUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriptionUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String svnUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String tagsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String teamsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String treesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String url, int watchers, int watchersCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    public final boolean component17() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    public final boolean component20() {
        return false;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final int component22() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    public final boolean component29() {
        return false;
    }
    
    public final boolean component30() {
        return false;
    }
    
    public final boolean component31() {
        return false;
    }
    
    public final boolean component32() {
        return false;
    }
    
    public final boolean component33() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component36() {
        return null;
    }
    
    public final int component37() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.suleymancelik.github.data.repo.License component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component51() {
        return null;
    }
    
    public final int component52() {
        return 0;
    }
    
    public final int component53() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.suleymancelik.github.data.repo.Owner component54() {
        return null;
    }
    
    public final boolean component55() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component56() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component57() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component58() {
        return null;
    }
    
    public final int component59() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component60() {
        return null;
    }
    
    public final int component61() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component62() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component63() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component64() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component65() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component66() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component67() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component68() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component69() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component70() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component71() {
        return null;
    }
    
    public final int component72() {
        return 0;
    }
    
    public final int component73() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.suleymancelik.github.data.repo.RepoListModelItem copy(@org.jetbrains.annotations.NotNull()
    java.lang.String archiveUrl, boolean archived, @org.jetbrains.annotations.NotNull()
    java.lang.String assigneesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String blobsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String branchesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String cloneUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String collaboratorsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String commentsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String commitsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String compareUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String contentsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String contributorsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultBranch, @org.jetbrains.annotations.NotNull()
    java.lang.String deploymentsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean disabled, @org.jetbrains.annotations.NotNull()
    java.lang.String downloadsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String eventsUrl, boolean fork, int forks, int forksCount, @org.jetbrains.annotations.NotNull()
    java.lang.String forksUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.NotNull()
    java.lang.String gitCommitsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String gitRefsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String gitTagsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String gitUrl, boolean hasDownloads, boolean hasIssues, boolean hasPages, boolean hasProjects, boolean hasWiki, @org.jetbrains.annotations.NotNull()
    java.lang.String homepage, @org.jetbrains.annotations.NotNull()
    java.lang.String hooksUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlUrl, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String issueCommentUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String issueEventsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String issuesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String keysUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String labelsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String languagesUrl, @org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.data.repo.License license, @org.jetbrains.annotations.NotNull()
    java.lang.String mergesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String milestonesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.Object mirrorUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String nodeId, @org.jetbrains.annotations.NotNull()
    java.lang.String notificationsUrl, int openIssues, int openIssuesCount, @org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.data.repo.Owner owner, boolean p54_1990234817, @org.jetbrains.annotations.NotNull()
    java.lang.String pullsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String pushedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String releasesUrl, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String sshUrl, int stargazersCount, @org.jetbrains.annotations.NotNull()
    java.lang.String stargazersUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String statusesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String subscribersUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriptionUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String svnUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String tagsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String teamsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String treesUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String url, int watchers, int watchersCount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}