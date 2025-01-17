package com.rbkmoney.threeds.server.domain.root.emvco;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.rbkmoney.threeds.server.domain.message.MessageExtension;
import com.rbkmoney.threeds.server.domain.result.ResultsStatus;
import com.rbkmoney.threeds.server.domain.root.Message;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@Builder
@JsonInclude(value = JsonInclude.Include.NON_ABSENT)
public class RRes extends Message {

    @ToString.Include
    private String threeDSServerTransID;
    @ToString.Include
    private String acsTransID;
    @ToString.Include
    private String dsTransID;
    private List<MessageExtension> messageExtension;
    @ToString.Include
    private ResultsStatus resultsStatus;
    @ToString.Include
    private String sdkTransID;

}
