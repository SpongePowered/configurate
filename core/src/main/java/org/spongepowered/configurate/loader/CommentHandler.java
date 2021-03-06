/*
 * Configurate
 * Copyright (C) zml and Configurate contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.spongepowered.configurate.loader;

import com.google.errorprone.annotations.Immutable;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * Extracts comments from a buffered reader or collection of lines.
 *
 * @since 4.0.0
 */
@Immutable
public interface CommentHandler {

    /**
     * Defines the handlers behaviour for reading comments.
     *
     * @param reader reader to get input from
     * @return an extracted comment, if any
     * @throws IOException if any IO error occurs in the process
     * @since 4.0.0
     */
    @Nullable String extractHeader(BufferedReader reader) throws IOException;

    /**
     * Converts the specified lines into a comment.
     *
     * @param lines lines to make a comment
     * @return transformed lines as a stream
     * @since 4.0.0
     */
    Stream<String> toComment(Stream<String> lines);

}
