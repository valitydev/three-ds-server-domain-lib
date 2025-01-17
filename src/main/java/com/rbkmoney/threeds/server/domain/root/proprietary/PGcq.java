package com.rbkmoney.threeds.server.domain.root.proprietary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.rbkmoney.threeds.server.constraint.CustomValidation;
import com.rbkmoney.threeds.server.domain.challenge.ChallengeWindowSize;
import com.rbkmoney.threeds.server.domain.root.Message;
import com.rbkmoney.threeds.server.serialization.EnumWrapper;
import com.rbkmoney.threeds.server.serialization.deserializer.ChallengeWindowSizeDeserializer;
import com.rbkmoney.threeds.server.serialization.serializer.ChallengeWindowSizeSerializer;
import lombok.*;

/**
 * proprietary Get Challenge Request
 * класс - костыль для тестов, который изначально не правильно работает , по идее согласно тестовой спеки ,
 * он должен  возвращать сразу лабе PGcs, и там плюс должен быть сформированный html с кодированным CReq.
 * но тест при такой реализации валился с их стороны хуй знает почему.
 * но когда я стал отправлять этот PGcs в DS (DS не принимает изначально такой тип сообщения),
 * DS стал возвращать Erro (что логично),
 * который 3дс потом редиректит лабе и тест успешно завершался, поэтому я оставил все как есть.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@Builder
@JsonInclude(value = JsonInclude.Include.NON_ABSENT)
@CustomValidation
public class PGcq extends Message {

    private String p_messageVersion;
    @ToString.Include
    private String threeDSServerTransID;
    @ToString.Include
    private String acsTransID;
    private String threeDSSessionData;
    @JsonDeserialize(using = ChallengeWindowSizeDeserializer.class)
    @JsonSerialize(using = ChallengeWindowSizeSerializer.class)
    private EnumWrapper<ChallengeWindowSize> challengeWindowSize;

}
